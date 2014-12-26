/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;CoreFoundation.h&gt;. */
public final class CoreFoundation {

	/** Boolean values. */
	public static final byte
		TRUE  = 0x1,
		FALSE = 0x0;

	/** Platform-independent built-in encodings; always available on all platforms. */
	public static final int
		kCFStringEncodingMacRoman      = 0x0,
		kCFStringEncodingWindowsLatin1 = 0x500,
		kCFStringEncodingISOLatin1     = 0x201,
		kCFStringEncodingNextStepLatin = 0xB01,
		kCFStringEncodingASCII         = 0x600,
		kCFStringEncodingUnicode       = 0x100,
		kCFStringEncodingUTF8          = 0x8000100,
		kCFStringEncodingNonLossyASCII = 0xBFF,
		kCFStringEncodingUTF16         = 0x100,
		kCFStringEncodingUTF16BE       = 0x10000100,
		kCFStringEncodingUTF16LE       = 0x14000100,
		kCFStringEncodingUTF32         = 0xC000100,
		kCFStringEncodingUTF32BE       = 0x18000100,
		kCFStringEncodingUTF32LE       = 0x1C000100;

	/** URL path styles. */
	public static final int
		kCFURLPOSIXPathStyle   = 0x0,
		kCFURLHFSPathStyle     = 0x1,
		kCFURLWindowsPathStyle = 0x2;

	static { LWJGLUtil.initialize(); }

	private CoreFoundation() {}

	// --- [ kCFAllocatorDefault ] ---

	/** This is a synonym for {@code NULL}, if you'd rather use a named constant. */
	public static native long kCFAllocatorDefault();

	// --- [ kCFAllocatorSystemDefault ] ---

	/** Default system allocator; you rarely need to use this. */
	public static native long kCFAllocatorSystemDefault();

	// --- [ kCFAllocatorMalloc ] ---

	/**
	 * This allocator uses {@code malloc()}, {@code realloc()}, and {@code free()}. This should not be generally used; stick to {@link #kCFAllocatorDefault}
	 * whenever possible. This allocator is useful as the "bytesDeallocator" in {@code CFData} or "contentsDeallocator" in {@code CFString} where the memory
	 * was obtained as a result of {@code malloc()} type functions.
	 */
	public static native long kCFAllocatorMalloc();

	// --- [ kCFAllocatorMallocZone ] ---

	/**
	 * This allocator explicitly uses the default malloc zone, returned by {@code malloc_default_zone()}. It should only be used when an object is safe to be
	 * allocated in non-scanned memory.
	 */
	public static native long kCFAllocatorMallocZone();

	// --- [ kCFAllocatorNull ] ---

	/**
	 * Null allocator which does nothing and allocates no memory. This allocator is useful as the "bytesDeallocator" in {@code CFData} or "contentsDeallocator"
	 * in {@code CFString} where the memory should not be freed.
	 */
	public static native long kCFAllocatorNull();

	// --- [ kCFAllocatorUseContext ] ---

	/** Special allocator argument to {@link #CFAllocatorCreate} which means "use the functions given in the context to allocate the allocator itself as well". */
	public static native long kCFAllocatorUseContext();

	// --- [ CFRetain ] ---

	/** JNI method for {@link #CFRetain} */
	@JavadocExclude
	public static native long nCFRetain(long cf);

	/**
	 * Retains a Core Foundation object.
	 * 
	 * <p>You should retain a Core Foundation object when you receive it from elsewhere (that is, you did not create or copy it) and you want it to persist. If
	 * you retain a Core Foundation object you are responsible for releasing it.</p>
	 *
	 * @param cf the CFType object to retain
	 */
	public static long CFRetain(long cf) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cf);
		return nCFRetain(cf);
	}

	// --- [ CFRelease ] ---

	/** JNI method for {@link #CFRelease} */
	@JavadocExclude
	public static native void nCFRelease(long cf);

	/**
	 * Releases a Core Foundation object.
	 * 
	 * <p>If the retain count of {@code cf} becomes zero the memory allocated to the object is deallocated and the object is destroyed. If you create, copy, or
	 * explicitly retain (see the {@link #CFRetain} function) a Core Foundation object, you are responsible for releasing it when you no longer need it.</p>
	 *
	 * @param cf the CFType object to release
	 */
	public static void CFRelease(long cf) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(cf);
		nCFRelease(cf);
	}

	// --- [ CFBundleCreate ] ---

	/** JNI method for {@link #CFBundleCreate} */
	@JavadocExclude
	public static native long nCFBundleCreate(long allocator, long bundleURL);

	/**
	 * Creates a {@code CFBundle} object.
	 *
	 * @param allocator the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
	 * @param bundleURL the location of the bundle for which to create a {@code CFBundle} object
	 */
	public static long CFBundleCreate(long allocator, long bundleURL) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(bundleURL);
		return nCFBundleCreate(allocator, bundleURL);
	}

	// --- [ CFBundleGetFunctionPointerForName ] ---

	/** JNI method for {@link #CFBundleGetFunctionPointerForName} */
	@JavadocExclude
	public static native long nCFBundleGetFunctionPointerForName(long bundle, long functionName);

	/**
	 * Returns a pointer to a function in a bundle’s executable code using the function name as the search key.
	 *
	 * @param bundle       the bundle to examine
	 * @param functionName the name of the function to locate
	 */
	public static long CFBundleGetFunctionPointerForName(long bundle, long functionName) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(bundle);
			checkPointer(functionName);
		}
		return nCFBundleGetFunctionPointerForName(bundle, functionName);
	}

	// --- [ CFStringCreateWithCString ] ---

	/** JNI method for {@link #CFStringCreateWithCString} */
	@JavadocExclude
	public static native long nCFStringCreateWithCString(long allocator, long cStr, int encoding);

	/**
	 * Creates an immutable string from a C string.
	 *
	 * @param allocator the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
	 * @param cStr      the NULL-terminated C string to be used to create the {@code CFString} object. The string must use an 8-bit encoding.
	 * @param encoding  the encoding of the characters in the C string. The encoding must specify an 8-bit encoding.
	 */
	public static long CFStringCreateWithCString(long allocator, ByteBuffer cStr, int encoding) {
		return nCFStringCreateWithCString(allocator, memAddress(cStr), encoding);
	}

	// --- [ CFStringCreateWithCStringNoCopy ] ---

	/** JNI method for {@link #CFStringCreateWithCStringNoCopy} */
	@JavadocExclude
	public static native long nCFStringCreateWithCStringNoCopy(long allocator, long cStr, int encoding, long contentsDeallocator);

	/**
	 * Creates a CFString object from an external C string buffer that might serve as the backing store for the object.
	 *
	 * @param allocator           the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
	 * @param cStr                the NULL-terminated C string to be used to create the {@code CFString} object. The string must use an 8-bit encoding.
	 * @param encoding            the encoding of the characters in the C string. The encoding must specify an 8-bit encoding.
	 * @param contentsDeallocator the {@code CFAllocator} object to use to deallocate the external string buffer when it is no longer needed. You can pass {@code NULL} or
	 *                            {@code kCFAllocatorDefault} to request the default allocator for this purpose. If the buffer does not need to be deallocated, or if you want to
	 *                            assume responsibility for deallocating the buffer (and not have the {@code CFString} object deallocate it), pass {@code kCFAllocatorNull}.
	 */
	public static long CFStringCreateWithCStringNoCopy(long allocator, ByteBuffer cStr, int encoding, long contentsDeallocator) {
		return nCFStringCreateWithCStringNoCopy(allocator, memAddress(cStr), encoding, contentsDeallocator);
	}

	// --- [ CFURLCreateWithFileSystemPath ] ---

	/** JNI method for {@link #CFURLCreateWithFileSystemPath} */
	@JavadocExclude
	public static native long nCFURLCreateWithFileSystemPath(long allocator, long filePath, long pathStyle, byte isDirectory);

	/**
	 * Creates a {@code CFURL} object using a local file system path string.
	 *
	 * @param allocator   the allocator to use to allocate memory for the new object. Pass {@code NULL} or {@code kCFAllocatorDefault} to use the current default allocator.
	 * @param filePath    the path string to convert to a {@code CFURL} object. If {@code filePath} is not absolute, the resulting URL will be considered relative to the
	 *                    current working directory (evaluated when this function is being invoked).
	 * @param pathStyle   the operating system path style used in {@code filePath}
	 * @param isDirectory a Boolean value that specifies whether filePath is treated as a directory path when resolving against relative path components. Pass true if the
	 *                    pathname indicates a directory, false otherwise.
	 */
	public static long CFURLCreateWithFileSystemPath(long allocator, long filePath, long pathStyle, byte isDirectory) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(filePath);
		return nCFURLCreateWithFileSystemPath(allocator, filePath, pathStyle, isDirectory);
	}

}