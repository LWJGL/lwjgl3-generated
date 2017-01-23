/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jni;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to the Java Native Interface (JNI).
 * 
 * <p>The JNI is a native programming interface. It allows Java code that runs inside a Java Virtual Machine (VM) to interoperate with applications and
 * libraries written in other programming languages, such as C, C++, and assembly.</p>
 * 
 * <p>The most important benefit of the JNI is that it imposes no restrictions on the implementation of the underlying Java VM. Therefore, Java VM vendors
 * can add support for the JNI without affecting other parts of the VM. Programmers can write one version of a native application or library and expect it
 * to work with all Java VMs supporting the JNI.</p>
 * 
 * <p>LWJGL: Only functions that can reasonably be called from Java are exposed.</p>
 */
public class JNINativeInterface {

	/** JNI versions. */
	public static final int
		JNI_VERSION_1_1 = 0x10001,
		JNI_VERSION_1_2 = 0x10002,
		JNI_VERSION_1_4 = 0x10004,
		JNI_VERSION_1_6 = 0x10006,
		JNI_VERSION_1_8 = 0x10008,
		JNI_VERSION_9   = 0x90000;

	/**
	 * {@code jobjectRefType}: Return values from {@link #GetObjectRefType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #JNIInvalidRefType JNIInvalidRefType}</li>
	 * <li>{@link #JNILocalRefType JNILocalRefType}</li>
	 * <li>{@link #JNIGlobalRefType JNIGlobalRefType}</li>
	 * <li>{@link #JNIWeakGlobalRefType JNIWeakGlobalRefType}</li>
	 * </ul>
	 */
	public static final int
		JNIInvalidRefType    = 0,
		JNILocalRefType      = 1,
		JNIGlobalRefType     = 2,
		JNIWeakGlobalRefType = 3;

	/** jboolean constants. */
	public static final int
		JNI_FALSE = 0,
		JNI_TRUE  = 1;

	/**
	 * Possible return values for JNI functions.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #JNI_OK OK} - success</li>
	 * <li>{@link #JNI_ERR ERR} - unknown error</li>
	 * <li>{@link #JNI_EDETACHED EDETACHED} - thread detached from the VM</li>
	 * <li>{@link #JNI_EVERSION EVERSION} - JNI version error</li>
	 * <li>{@link #JNI_ENOMEM ENOMEM} - not enough memory</li>
	 * <li>{@link #JNI_EEXIST EEXIST} - VM already created</li>
	 * <li>{@link #JNI_EINVAL EINVAL} - invalid arguments</li>
	 * </ul>
	 */
	public static final int
		JNI_OK        = 0,
		JNI_ERR       = (-1),
		JNI_EDETACHED = (-2),
		JNI_EVERSION  = (-3),
		JNI_ENOMEM    = (-4),
		JNI_EEXIST    = (-5),
		JNI_EINVAL    = (-6);

	/** Used in {@code ReleaseScalarArrayElements}. */
	public static final int
		JNI_COMMIT = 1,
		JNI_ABORT  = 2;

	static { Library.initialize(); }

	protected JNINativeInterface() {
		throw new UnsupportedOperationException();
	}

	// --- [ GetVersion ] ---

	/**
	 * Returns the version of the native method interface.
	 *
	 * @return the major version number in the higher 16 bits and the minor version number in the lower 16 bits
	 */
	public static native int GetVersion();

	// --- [ FindClass ] ---

	/** Unsafe version of: {@link #FindClass} */
	public static native long nFindClass(long name);

	/**
	 * Returns a class object from a fully-qualified name.
	 * 
	 * <p>The Java security model allows non-system classes to load and call native methods. {@code FindClass} Locates the class loader associated with the
	 * current native method; that is, the class loader of the class that declared the native method. If the native method belongs to a system class, no class
	 * loader will be involved. Otherwise, the proper class loader will be invoked to load and link the named class.</p>
	 * 
	 * <p>When FindClass is called through the Invocation Interface, there is no current native method or its associated class loader. In that case, the result
	 * of {@link ClassLoader#getSystemClassLoader} is used. This is the class loader the virtual machine creates for applications, and is able to locate
	 * classes listed in the {@code java.class.path} property.</p>
	 * 
	 * <p>The {@code name} argument is a fully-qualified class name or an array type signature. For example, the fully-qualified class name for the
	 * {@code java.lang.String} class is:</p>
	 * 
	 * <pre><code>"java/lang/String"</code></pre>
	 * 
	 * <p>The array type signature of the array class {@code java.lang.Object[]} is:</p>
	 * 
	 * <pre><code>"[Ljava/lang/Object;"</code></pre>
	 *
	 * @param name a fully-qualified class name (that is, a package name, delimited by “/”, followed by the class name). If the name begins with “[“ (the array
	 *             signature character), it returns an array class. The string is encoded in modified UTF-8.
	 *
	 * @return a class object from a fully-qualified name, or {@code NULL} if the class cannot be found
	 */
	public static long FindClass(ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nFindClass(memAddress(name));
	}

	/**
	 * Returns a class object from a fully-qualified name.
	 * 
	 * <p>The Java security model allows non-system classes to load and call native methods. {@code FindClass} Locates the class loader associated with the
	 * current native method; that is, the class loader of the class that declared the native method. If the native method belongs to a system class, no class
	 * loader will be involved. Otherwise, the proper class loader will be invoked to load and link the named class.</p>
	 * 
	 * <p>When FindClass is called through the Invocation Interface, there is no current native method or its associated class loader. In that case, the result
	 * of {@link ClassLoader#getSystemClassLoader} is used. This is the class loader the virtual machine creates for applications, and is able to locate
	 * classes listed in the {@code java.class.path} property.</p>
	 * 
	 * <p>The {@code name} argument is a fully-qualified class name or an array type signature. For example, the fully-qualified class name for the
	 * {@code java.lang.String} class is:</p>
	 * 
	 * <pre><code>"java/lang/String"</code></pre>
	 * 
	 * <p>The array type signature of the array class {@code java.lang.Object[]} is:</p>
	 * 
	 * <pre><code>"[Ljava/lang/Object;"</code></pre>
	 *
	 * @param name a fully-qualified class name (that is, a package name, delimited by “/”, followed by the class name). If the name begins with “[“ (the array
	 *             signature character), it returns an array class. The string is encoded in modified UTF-8.
	 *
	 * @return a class object from a fully-qualified name, or {@code NULL} if the class cannot be found
	 */
	public static long FindClass(CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.UTF8(name);
			return nFindClass(memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ NewGlobalRef ] ---

	/**
	 * Creates a new global reference to the object referred to by the {@code obj} argument. The {@code obj} argument may be a global or local reference.
	 * Global references must be explicitly disposed of by calling {@link #DeleteGlobalRef}.
	 *
	 * @param obj a global or local reference
	 *
	 * @return a global reference, or {@code NULL} if the system runs out of memory
	 */
	public static native long NewGlobalRef(Object obj);

	// --- [ DeleteGlobalRef ] ---

	/** Unsafe version of: {@link #DeleteGlobalRef} */
	public static native void nDeleteGlobalRef(long globalRef);

	/**
	 * Deletes the global reference pointed to by {@code globalRef}.
	 *
	 * @param globalRef a global reference
	 */
	public static void DeleteGlobalRef(long globalRef) {
		if ( CHECKS )
			check(globalRef);
		nDeleteGlobalRef(globalRef);
	}

	// --- [ GetBooleanArrayElements ] ---

	/** Unsafe version of: {@link #GetBooleanArrayElements} */
	public static native long nGetBooleanArrayElements(byte[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseBooleanArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseBooleanArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static ByteBuffer GetBooleanArrayElements(byte[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetBooleanArrayElements(array, memAddressSafe(isCopy));
		return memByteBuffer(__result, array.length);
	}

	// --- [ ReleaseBooleanArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseBooleanArrayElements} */
	public static native void nReleaseBooleanArrayElements(byte[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetBooleanArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseBooleanArrayElements(byte[] array, ByteBuffer elems, int mode) {
		nReleaseBooleanArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetByteArrayElements ] ---

	/** Unsafe version of: {@link #GetByteArrayElements} */
	public static native long nGetByteArrayElements(byte[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseByteArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseByteArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static ByteBuffer GetByteArrayElements(byte[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetByteArrayElements(array, memAddressSafe(isCopy));
		return memByteBuffer(__result, array.length);
	}

	// --- [ ReleaseByteArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseByteArrayElements} */
	public static native void nReleaseByteArrayElements(byte[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetByteArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseByteArrayElements(byte[] array, ByteBuffer elems, int mode) {
		nReleaseByteArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetCharArrayElements ] ---

	/** Unsafe version of: {@link #GetCharArrayElements} */
	public static native long nGetCharArrayElements(char[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseCharArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseCharArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static ShortBuffer GetCharArrayElements(char[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetCharArrayElements(array, memAddressSafe(isCopy));
		return memShortBuffer(__result, array.length);
	}

	// --- [ ReleaseCharArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseCharArrayElements} */
	public static native void nReleaseCharArrayElements(char[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetCharArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseCharArrayElements(char[] array, ShortBuffer elems, int mode) {
		nReleaseCharArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetShortArrayElements ] ---

	/** Unsafe version of: {@link #GetShortArrayElements} */
	public static native long nGetShortArrayElements(short[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseShortArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseShortArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static ShortBuffer GetShortArrayElements(short[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetShortArrayElements(array, memAddressSafe(isCopy));
		return memShortBuffer(__result, array.length);
	}

	// --- [ ReleaseShortArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseShortArrayElements} */
	public static native void nReleaseShortArrayElements(short[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetShortArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseShortArrayElements(short[] array, ShortBuffer elems, int mode) {
		nReleaseShortArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetIntArrayElements ] ---

	/** Unsafe version of: {@link #GetIntArrayElements} */
	public static native long nGetIntArrayElements(int[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseIntArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseIntArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static IntBuffer GetIntArrayElements(int[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetIntArrayElements(array, memAddressSafe(isCopy));
		return memIntBuffer(__result, array.length);
	}

	// --- [ ReleaseIntArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseIntArrayElements} */
	public static native void nReleaseIntArrayElements(int[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetIntArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseIntArrayElements(int[] array, IntBuffer elems, int mode) {
		nReleaseIntArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetLongArrayElements ] ---

	/** Unsafe version of: {@link #GetLongArrayElements} */
	public static native long nGetLongArrayElements(long[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseLongArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseLongArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static LongBuffer GetLongArrayElements(long[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetLongArrayElements(array, memAddressSafe(isCopy));
		return memLongBuffer(__result, array.length);
	}

	// --- [ ReleaseLongArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseLongArrayElements} */
	public static native void nReleaseLongArrayElements(long[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetLongArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseLongArrayElements(long[] array, LongBuffer elems, int mode) {
		nReleaseLongArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetFloatArrayElements ] ---

	/** Unsafe version of: {@link #GetFloatArrayElements} */
	public static native long nGetFloatArrayElements(float[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseFloatArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseFloatArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static FloatBuffer GetFloatArrayElements(float[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetFloatArrayElements(array, memAddressSafe(isCopy));
		return memFloatBuffer(__result, array.length);
	}

	// --- [ ReleaseFloatArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseFloatArrayElements} */
	public static native void nReleaseFloatArrayElements(float[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetFloatArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseFloatArrayElements(float[] array, FloatBuffer elems, int mode) {
		nReleaseFloatArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetDoubleArrayElements ] ---

	/** Unsafe version of: {@link #GetDoubleArrayElements} */
	public static native long nGetDoubleArrayElements(double[] array, long isCopy);

	/**
	 * Returns the body of the primitive array. The result is valid until the {@link #ReleaseDoubleArrayElements} function is called. Since the returned array
	 * may be a copy of the Java array, changes made to the returned array will not necessarily be reflected in the original array until
	 * {@link #ReleaseDoubleArrayElements} is called.
	 * 
	 * <p>If {@code isCopy} is not {@code NULL}, then {@code *isCopy} is set to {@link #JNI_TRUE TRUE} if a copy is made; or it is set to {@link #JNI_FALSE FALSE} if no copy is made.</p>
	 *
	 * @param array  the primitive array
	 * @param isCopy a pointer to a boolean
	 *
	 * @return a pointer to the array elements, or {@code NULL} if the operation fails
	 */
	public static DoubleBuffer GetDoubleArrayElements(double[] array, ByteBuffer isCopy) {
		if ( CHECKS )
			checkSafe(isCopy, 1);
		long __result = nGetDoubleArrayElements(array, memAddressSafe(isCopy));
		return memDoubleBuffer(__result, array.length);
	}

	// --- [ ReleaseDoubleArrayElements ] ---

	/** Unsafe version of: {@link #ReleaseDoubleArrayElements} */
	public static native void nReleaseDoubleArrayElements(double[] array, long elems, int mode);

	/**
	 * Informs the VM that the native code no longer needs access to {@code elems}. The {@code elems} argument is a pointer derived from array using the
	 * {@link #GetDoubleArrayElements} function. If necessary, this function copies back all changes made to elems to the original array.
	 * 
	 * <p>The {@code mode} argument provides information on how the array buffer should be released. {@code mode} has no effect if {@code elems} is not a
	 * copy of the elements in array. Otherwise, mode has the following impact, as shown in the following table:</p>
	 * 
	 * <table class=lwjgl>
	 * <tr><th>mode</th><th>actions</th></tr>
	 * <tr><td>0</td><td>copy back the content and free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_COMMIT COMMIT}</td><td>copy back the content but do not free the elems buffer</td></tr>
	 * <tr><td>{@link #JNI_ABORT ABORT}</td><td>free the buffer without copying back the possible changes</td></tr>
	 * </table>
	 * 
	 * <p>In most cases, programmers pass “0” to the mode argument to ensure consistent behavior for both pinned and copied arrays. The other options give
	 * the programmer more control over memory management and should be used with extreme care.</p>
	 *
	 * @param array a Java array object
	 * @param elems a pointer to array elements
	 * @param mode  the release mode. One of:<br><table><tr><td>0</td><td>{@link #JNI_COMMIT COMMIT}</td><td>{@link #JNI_ABORT ABORT}</td></tr></table>
	 */
	public static void ReleaseDoubleArrayElements(double[] array, DoubleBuffer elems, int mode) {
		nReleaseDoubleArrayElements(array, memAddress(elems), mode);
	}

	// --- [ GetBooleanArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetBooleanArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetBooleanArrayRegion(byte[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetBooleanArrayRegion(byte[] array, int start, ByteBuffer buf) {
		nGetBooleanArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetBooleanArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetBooleanArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetBooleanArrayRegion(byte[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetBooleanArrayRegion(byte[] array, int start, ByteBuffer buf) {
		nSetBooleanArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetByteArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetByteArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetByteArrayRegion(byte[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetByteArrayRegion(byte[] array, int start, ByteBuffer buf) {
		nGetByteArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetByteArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetByteArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetByteArrayRegion(byte[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetByteArrayRegion(byte[] array, int start, ByteBuffer buf) {
		nSetByteArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetCharArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetCharArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetCharArrayRegion(char[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetCharArrayRegion(char[] array, int start, ShortBuffer buf) {
		nGetCharArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetCharArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetCharArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetCharArrayRegion(char[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetCharArrayRegion(char[] array, int start, ShortBuffer buf) {
		nSetCharArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetShortArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetShortArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetShortArrayRegion(short[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetShortArrayRegion(short[] array, int start, ShortBuffer buf) {
		nGetShortArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetShortArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetShortArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetShortArrayRegion(short[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetShortArrayRegion(short[] array, int start, ShortBuffer buf) {
		nSetShortArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetIntArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetIntArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetIntArrayRegion(int[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetIntArrayRegion(int[] array, int start, IntBuffer buf) {
		nGetIntArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetIntArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetIntArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetIntArrayRegion(int[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetIntArrayRegion(int[] array, int start, IntBuffer buf) {
		nSetIntArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetLongArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetLongArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetLongArrayRegion(long[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetLongArrayRegion(long[] array, int start, LongBuffer buf) {
		nGetLongArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetLongArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetLongArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetLongArrayRegion(long[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetLongArrayRegion(long[] array, int start, LongBuffer buf) {
		nSetLongArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetFloatArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetFloatArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetFloatArrayRegion(float[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetFloatArrayRegion(float[] array, int start, FloatBuffer buf) {
		nGetFloatArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetFloatArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetFloatArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetFloatArrayRegion(float[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetFloatArrayRegion(float[] array, int start, FloatBuffer buf) {
		nSetFloatArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ GetDoubleArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #GetDoubleArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nGetDoubleArrayRegion(double[] array, int start, int len, long buf);

	/**
	 * Copies a region of a primitive array into a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the destination buffer
	 */
	public static void GetDoubleArrayRegion(double[] array, int start, DoubleBuffer buf) {
		nGetDoubleArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ SetDoubleArrayRegion ] ---

	/**
	 * Unsafe version of: {@link #SetDoubleArrayRegion}
	 *
	 * @param len the number of elements to be copied
	 */
	public static native void nSetDoubleArrayRegion(double[] array, int start, int len, long buf);

	/**
	 * Copies back a region of a primitive array from a buffer.
	 *
	 * @param array a Java array
	 * @param start the starting index
	 * @param buf   the source buffer
	 */
	public static void SetDoubleArrayRegion(double[] array, int start, DoubleBuffer buf) {
		nSetDoubleArrayRegion(array, start, buf.remaining(), memAddress(buf));
	}

	// --- [ RegisterNatives ] ---

	/**
	 * Unsafe version of: {@link #RegisterNatives}
	 *
	 * @param nMethods the number of native methods in the class
	 */
	public static native int nRegisterNatives(long targetClass, long methods, int nMethods);

	/**
	 * Registers native methods with the class specified by the {@code targetClass} argument. The methods parameter specifies an array of JNINativeMethod
	 * structures that contain the names, signatures, and function pointers of the native methods. The name and signature fields of the {@link JNINativeMethod}
	 * structure are pointers to modified UTF-8 strings. The {@code nMethods} parameter specifies the number of native methods in the array.
	 *
	 * @param targetClass 
	 * @param methods     the native methods in the class
	 *
	 * @return “0” on success; returns a negative value on failure
	 */
	public static int RegisterNatives(long targetClass, JNINativeMethod.Buffer methods) {
		if ( CHECKS ) {
			check(targetClass);
			JNINativeMethod.validate(methods.address(), methods.remaining());
		}
		return nRegisterNatives(targetClass, methods.address(), methods.remaining());
	}

	// --- [ UnregisterNatives ] ---

	/** Unsafe version of: {@link #UnregisterNatives} */
	public static native int nUnregisterNatives(long targetClass);

	/**
	 * Unregisters native methods of a class. The class goes back to the state before it was linked or registered with its native method functions.
	 * 
	 * <p>This function should not be used in normal native code. Instead, it provides special programs a way to reload and relink native libraries.</p>
	 *
	 * @param targetClass a Java class object
	 *
	 * @return “0” on success; returns a negative value on failure
	 */
	public static int UnregisterNatives(long targetClass) {
		if ( CHECKS )
			check(targetClass);
		return nUnregisterNatives(targetClass);
	}

	// --- [ GetStringRegion ] ---

	/** Unsafe version of: {@link #GetStringRegion} */
	public static native void nGetStringRegion(String str, int start, int len, long buf);

	/**
	 * Copies {@code len} number of Unicode characters beginning at offset {@code start} to the given buffer {@code buf}.
	 *
	 * @param str   
	 * @param start 
	 * @param buf   
	 */
	public static void GetStringRegion(String str, int start, ByteBuffer buf) {
		nGetStringRegion(str, start, buf.remaining() >> 1, memAddress(buf));
	}

	// --- [ GetStringUTFRegion ] ---

	/** Unsafe version of: {@link #GetStringUTFRegion} */
	public static native void nGetStringUTFRegion(String str, int start, int len, long buf);

	/**
	 * Translates {@code len} number of Unicode characters beginning at offset start into modified UTF-8 encoding and place the result in the given buffer
	 * {@code buf}.
	 *
	 * @param str   
	 * @param start 
	 * @param len   
	 * @param buf   
	 */
	public static void GetStringUTFRegion(String str, int start, int len, ByteBuffer buf) {
		if ( CHECKS )
			check(buf, len);
		nGetStringUTFRegion(str, start, len, memAddress(buf));
	}

	// --- [ NewWeakGlobalRef ] ---

	/**
	 * Creates a new weak global reference. Returns {@code NULL} if {@code obj} refers to null, or if the VM runs out of memory. If the VM runs out of memory, an
	 * {@code OutOfMemoryError} will be thrown.
	 *
	 * @param obj 
	 */
	public static native long NewWeakGlobalRef(Object obj);

	// --- [ DeleteWeakGlobalRef ] ---

	/** Unsafe version of: {@link #DeleteWeakGlobalRef} */
	public static native void nDeleteWeakGlobalRef(long weakGlobalRef);

	/**
	 * Delete the VM resources needed for the given weak global reference.
	 *
	 * @param weakGlobalRef 
	 */
	public static void DeleteWeakGlobalRef(long weakGlobalRef) {
		if ( CHECKS )
			check(weakGlobalRef);
		nDeleteWeakGlobalRef(weakGlobalRef);
	}

	// --- [ NewDirectByteBuffer ] ---

	/** Unsafe version of: {@link #NewDirectByteBuffer} */
	public static native ByteBuffer nNewDirectByteBuffer(long address, long capacity);

	/**
	 * Allocates and returns a direct {@code java.nio.ByteBuffer} referring to the block of memory starting at the memory address address and extending
	 * capacity bytes.
	 * 
	 * <p>Native code that calls this function and returns the resulting byte-buffer object to Java-level code should ensure that the buffer refers to a valid
	 * region of memory that is accessible for reading and, if appropriate, writing. An attempt to access an invalid memory location from Java code will
	 * either return an arbitrary value, have no visible effect, or cause an unspecified exception to be thrown.</p>
	 *
	 * @param address  the starting address of the memory region (must not be {@code NULL})
	 * @param capacity the size in bytes of the memory region (must be positive)
	 *
	 * @return a local reference to the newly-instantiated {@code java.nio.ByteBuffer} object. Returns {@code NULL} if an exception occurs, or if JNI access to direct
	 *         buffers is not supported by this virtual machine.
	 */
	public static ByteBuffer NewDirectByteBuffer(long address, long capacity) {
		if ( CHECKS )
			check(address);
		return nNewDirectByteBuffer(address, capacity);
	}

	// --- [ GetDirectBufferAddress ] ---

	/**
	 * Fetches and returns the starting address of the memory region referenced by the given direct {@code java.nio.Buffer}.
	 * 
	 * <p>This function allows native code to access the same memory region that is accessible to Java code via the buffer object.</p>
	 *
	 * @param buf a direct {@code java.nio.Buffer} object (must not be {@code NULL})
	 *
	 * @return the starting address of the memory region referenced by the buffer. Returns {@code NULL} if the memory region is undefined, if the given object is not a
	 *         direct {@code java.nio.Buffer}, or if JNI access to direct buffers is not supported by this virtual machine.
	 */
	public static native long GetDirectBufferAddress(Buffer buf);

	// --- [ GetObjectRefType ] ---

	/**
	 * Returns the type of the object referred to by the {@code obj} argument. The argument {@code obj} can either be a local, global or weak global
	 * reference.
	 *
	 * @param obj a local, global or weak global reference
	 */
	public static native int GetObjectRefType(Object obj);

}