/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;


@FunctionalInterface
public interface NkCommandCustomCallbackI extends CallbackI.P {

	String SIGNATURE = "(pssssp)p";

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgShort(args),
			dcbArgShort(args),
			dcbArgShort(args),
			dcbArgShort(args),
			dcbArgPointer(args)
		);
	}


	long invoke(long canvas, short x, short y, short w, short h, long callback_data);

}