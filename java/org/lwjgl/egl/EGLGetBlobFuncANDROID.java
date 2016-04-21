/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link ANDROIDBlobCache#eglSetBlobCacheFuncsANDROID SetBlobCacheFuncsANDROID} method. */
public abstract class EGLGetBlobFuncANDROID extends Callback implements EGLGetBlobFuncANDROIDI {

	/** Creates a {@code EGLGetBlobFuncANDROID} instance from the specified function pointer. */
	public static EGLGetBlobFuncANDROID create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		EGLGetBlobFuncANDROIDI instance = Callback.get(functionPointer);
		return instance instanceof EGLGetBlobFuncANDROID
			? (EGLGetBlobFuncANDROID)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code EGLGetBlobFuncANDROID} instance that delegates to the specified {@code EGLGetBlobFuncANDROIDI} instance. */
	public static EGLGetBlobFuncANDROID create(EGLGetBlobFuncANDROIDI instance) {
		return instance instanceof EGLGetBlobFuncANDROID
			? (EGLGetBlobFuncANDROID)instance
			: new Container(instance.address(), instance);
	}

	protected EGLGetBlobFuncANDROID() {
		super(NULL);
		address = EGLGetBlobFuncANDROIDI.super.address();
	}

	private EGLGetBlobFuncANDROID(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends EGLGetBlobFuncANDROID {

		private final EGLGetBlobFuncANDROIDI delegate;

		Container(long functionPointer, EGLGetBlobFuncANDROIDI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long key, long keySize, long value, long valueSize) {
			return delegate.invoke(key, keySize, value, valueSize);
		}

	}

}