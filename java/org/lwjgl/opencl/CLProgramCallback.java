/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} and {@link CL12#clLinkProgram LinkProgram} methods. */
public abstract class CLProgramCallback extends Callback implements CLProgramCallbackI {

	/** Creates a {@code CLProgramCallback} instance from the specified function pointer. */
	public static CLProgramCallback create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		CLProgramCallbackI instance = Callback.get(functionPointer);
		return instance instanceof CLProgramCallback
			? (CLProgramCallback)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code CLProgramCallback} instance that delegates to the specified {@code CLProgramCallbackI} instance. */
	public static CLProgramCallback create(CLProgramCallbackI instance) {
		return instance instanceof CLProgramCallback
			? (CLProgramCallback)instance
			: new Container(instance.address(), instance);
	}

	protected CLProgramCallback() {
		super(NULL);
		address = CLProgramCallbackI.super.address();
	}

	private CLProgramCallback(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends CLProgramCallback {

		private final CLProgramCallbackI delegate;

		Container(long functionPointer, CLProgramCallbackI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long program, long user_data) {
			delegate.invoke(program, user_data);
		}

	}

}