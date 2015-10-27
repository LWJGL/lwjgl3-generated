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
public abstract class EGLSetBlobFuncANDROID extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(4);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.egl.EGLSetBlobFuncANDROID");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected EGLSetBlobFuncANDROID() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args))
		);
	}


	public abstract void invoke(long key, long keySize, long value, long valueSize);

	/** A functional interface for {@link EGLSetBlobFuncANDROID}. */
	public interface SAM {
		void invoke(long key, long keySize, long value, long valueSize);
	}

	/**
	 * Creates a {@link EGLSetBlobFuncANDROID} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLSetBlobFuncANDROID} instance
	 */
	public static EGLSetBlobFuncANDROID create(final SAM sam) {
		return new EGLSetBlobFuncANDROID() {
			@Override
			public void invoke(long key, long keySize, long value, long valueSize) {
				sam.invoke(key, keySize, value, valueSize);
			}
		};
	}

	/** A functional interface for {@link EGLSetBlobFuncANDROID}. */
	public interface SAMBuffer {
		void invoke(ByteBuffer key, ByteBuffer value);
	}

	/**
	 * Creates a {@link EGLSetBlobFuncANDROID} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EGLSetBlobFuncANDROID} instance
	 */
	public static EGLSetBlobFuncANDROID createBuffer(final SAMBuffer sam) {
		return new EGLSetBlobFuncANDROID() {
			@Override
			public void invoke(long key, long keySize, long value, long valueSize) {
				sam.invoke(memByteBuffer(key, (int)keySize), memByteBuffer(value, (int)valueSize));
			}
		};
	}
	
}