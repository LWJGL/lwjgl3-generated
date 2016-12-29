/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface YGLoggerI extends CallbackI.I {

	String SIGNATURE = "(ipp)i";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}


	int invoke(int level, long format, long args);

}