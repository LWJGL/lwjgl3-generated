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
public interface EGLSetBlobFuncANDROID extends Callback.V {

	/** Creates a {@code EGLSetBlobFuncANDROID} instance from the specified function pointer. */
	static EGLSetBlobFuncANDROID create(long functionPointer) {
		return functionPointer == NULL ? null : new EGLSetBlobFuncANDROIDHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code EGLSetBlobFuncANDROID} instance that delegates to the specified {@code EGLSetBlobFuncANDROID} instance. */
	static EGLSetBlobFuncANDROID create(EGLSetBlobFuncANDROID sam) {
		return new EGLSetBlobFuncANDROIDHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pppp)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	void invoke(long key, long keySize, long value, long valueSize);

}

final class EGLSetBlobFuncANDROIDHandle extends Pointer.Default implements EGLSetBlobFuncANDROID {

	private final EGLSetBlobFuncANDROID delegate;

	EGLSetBlobFuncANDROIDHandle(long functionPointer, EGLSetBlobFuncANDROID delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long key, long keySize, long value, long valueSize) {
		delegate.invoke(key, keySize, value, valueSize);
	}

}