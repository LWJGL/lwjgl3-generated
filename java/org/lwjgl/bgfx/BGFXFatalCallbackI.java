/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * If fatal code is not {@link BGFX#BGFX_FATAL_DEBUG_CHECK FATAL_DEBUG_CHECK} this callback is called on unrecoverable error. It's not safe to continue, inform user and terminate application
 * from this call.
 * 
 * <p>Not thread safe and it can be called from any thread.</p>
 */
@FunctionalInterface
public interface BGFXFatalCallbackI extends CallbackI.V {

	String SIGNATURE = "(pip)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when a fatal error occurs.
	 *
	 * @param _this the callback interface
	 * @param _code the error code
	 * @param _str  the error message
	 */
	void invoke(long _this, int _code, long _str);

}