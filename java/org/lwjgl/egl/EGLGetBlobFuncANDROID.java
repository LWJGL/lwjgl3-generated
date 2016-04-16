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
public abstract class EGLGetBlobFuncANDROID extends Callback.P {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.egl.EGLGetBlobFuncANDROID");

	protected EGLGetBlobFuncANDROID() {
		super(CALL_CONVENTION_DEFAULT + "(pppp)p", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
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
	public static EGLGetBlobFuncANDROID create(SAM sam) {
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
	public static EGLGetBlobFuncANDROID createBuffer(SAMBuffer sam) {
		return new EGLGetBlobFuncANDROID() {
			@Override
			public long invoke(long key, long keySize, long value, long valueSize) {
				return sam.invoke(memByteBuffer(key, (int)keySize), memByteBuffer(value, (int)valueSize));
			}
		};
	}

}