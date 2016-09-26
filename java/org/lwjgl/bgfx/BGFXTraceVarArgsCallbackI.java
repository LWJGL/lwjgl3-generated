/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**  */
@FunctionalInterface
public interface BGFXTraceVarArgsCallbackI extends CallbackI.V {

	String SIGNATURE = "(ppspp)v";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgShort(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	void invoke(long _this, long _filePath, short _line, long _format, long _argList);

}