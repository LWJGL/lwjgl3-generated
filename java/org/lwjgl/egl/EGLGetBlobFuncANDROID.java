/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link ANDROIDBlobCache#eglSetBlobCacheFuncsANDROID} method. */
public abstract class EGLGetBlobFuncANDROID extends Closure.Ptr {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(4);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.egl.EGLGetBlobFuncANDROID");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_pointer,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected EGLGetBlobFuncANDROID() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}


	public abstract long invoke(long key, long keySize, long value, long valueSize);

	/** A functional interface for {@link EGLGetBlobFuncANDROID}. */
	public interface SAM {
		long invoke(long key, long keySize, long value, long valueSize);
	}

	/**
	 * Creates a {@link EGLGetBlobFuncANDROID} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLGetBlobFuncANDROID} instance
	 */
	public static EGLGetBlobFuncANDROID create(final SAM sam) {
		return new EGLGetBlobFuncANDROID() {
			@Override
			public long invoke(long key, long keySize, long value, long valueSize) {
				return sam.invoke(key, keySize, value, valueSize);
			}
		};
	}

	/** A functional interface for {@link EGLGetBlobFuncANDROID}. */
	public interface SAMBuffer {
		long invoke(ByteBuffer key, ByteBuffer value);
	}

	/**
	 * Creates a {@link EGLGetBlobFuncANDROID} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLGetBlobFuncANDROID} instance
	 */
	public static EGLGetBlobFuncANDROID createBuffer(final SAMBuffer sam) {
		return new EGLGetBlobFuncANDROID() {
			@Override
			public long invoke(long key, long keySize, long value, long valueSize) {
				return sam.invoke(memByteBuffer(key, (int)keySize), memByteBuffer(value, (int)valueSize));
			}
		};
	}
	
}