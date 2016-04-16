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
public abstract class CLProgramCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opencl.CLProgramCallback");

	protected CLProgramCallback() {
		super(CALL_CONVENTION_SYSTEM + "(pp)v", CLASSPATH);
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
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when the program is built, compiled or linked.
	 *
	 * @param program   the program that was built, compiled or linked
	 * @param user_data the user-specified value that was passed when calling {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} or {@link CL12#clLinkProgram LinkProgram}
	 */
	public abstract void invoke(long program, long user_data);

	/** A functional interface for {@link CLProgramCallback}. */
	public interface SAM {
		void invoke(long program, long user_data);
	}

	/**
	 * Creates a {@link CLProgramCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLProgramCallback} instance
	 */
	public static CLProgramCallback create(SAM sam) {
		return new CLProgramCallback() {
			@Override
			public void invoke(long program, long user_data) {
				sam.invoke(program, user_data);
			}
		};
	}

}