/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link ANDROIDBlobCache#eglSetBlobCacheFuncsANDROID SetBlobCacheFuncsANDROID} method. */
public abstract class EGLSetBlobFuncANDROID extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.egl.EGLSetBlobFuncANDROID");

	protected EGLSetBlobFuncANDROID() {
		super(CALL_CONVENTION_DEFAULT + "(pppp)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
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
	public static EGLSetBlobFuncANDROID create(SAM sam) {
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
	public static EGLSetBlobFuncANDROID createBuffer(SAMBuffer sam) {
		return new EGLSetBlobFuncANDROID() {
			@Override
			public void invoke(long key, long keySize, long value, long valueSize) {
				sam.invoke(memByteBuffer(key, (int)keySize), memByteBuffer(value, (int)valueSize));
			}
		};
	}

}