/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} and {@link CL12#clLinkProgram LinkProgram} methods. */
@FunctionalInterface
public interface CLProgramCallbackI extends CallbackI.V {

	@Override
	default long address() {
		return apiCreateCallback(this, "(pp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when the program is built, compiled or linked.
	 *
	 * @param program   the program that was built, compiled or linked
	 * @param user_data the user-specified value that was passed when calling {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} or {@link CL12#clLinkProgram LinkProgram}
	 */
	void invoke(long program, long user_data);

}