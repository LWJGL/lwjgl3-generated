/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} and {@link CL12#clLinkProgram LinkProgram} methods. */
@FunctionalInterface
public interface CLProgramCallback extends Callback.V {

	/** Creates a {@code CLProgramCallback} instance from the specified function pointer. */
	static CLProgramCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new CLProgramCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code CLProgramCallback} instance that delegates to the specified {@code CLProgramCallback} instance. */
	static CLProgramCallback create(CLProgramCallback sam) {
		return new CLProgramCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pp)v", true);
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

final class CLProgramCallbackHandle extends Pointer.Default implements CLProgramCallback {

	private final CLProgramCallback delegate;

	CLProgramCallbackHandle(long functionPointer, CLProgramCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long program, long user_data) {
		delegate.invoke(program, user_data);
	}

}