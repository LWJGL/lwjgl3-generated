/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link ANDROIDBlobCache#eglSetBlobCacheFuncsANDROID SetBlobCacheFuncsANDROID} method. */
@FunctionalInterface
public interface EGLGetBlobFuncANDROID extends Callback.P {

	/** Creates a {@code EGLGetBlobFuncANDROID} instance from the specified function pointer. */
	static EGLGetBlobFuncANDROID create(long functionPointer) {
		return functionPointer == NULL ? null : new EGLGetBlobFuncANDROIDHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code EGLGetBlobFuncANDROID} instance that delegates to the specified {@code EGLGetBlobFuncANDROID} instance. */
	static EGLGetBlobFuncANDROID create(EGLGetBlobFuncANDROID sam) {
		return new EGLGetBlobFuncANDROIDHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pppp)p", false);
	}

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	long invoke(long key, long keySize, long value, long valueSize);

}

final class EGLGetBlobFuncANDROIDHandle extends Pointer.Default implements EGLGetBlobFuncANDROID {

	private final EGLGetBlobFuncANDROID delegate;

	EGLGetBlobFuncANDROIDHandle(long functionPointer, EGLGetBlobFuncANDROID delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public long invoke(long key, long keySize, long value, long valueSize) {
		return delegate.invoke(key, keySize, value, valueSize);
	}

}