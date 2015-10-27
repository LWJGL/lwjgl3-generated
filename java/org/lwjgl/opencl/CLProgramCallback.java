/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link CL10#clBuildProgram}, {@link CL12#clCompileProgram} and {@link CL12#clLinkProgram} methods. */
public abstract class CLProgramCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.opencl.CLProgramCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected CLProgramCallback() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}

	/**
	 * Will be called when the program is built, compiled or linked.
	 *
	 * @param program   the program that was built, compiled or linked
	 * @param user_data the user-specified value that was passed when calling {@link CL10#clBuildProgram}, {@link CL12#clCompileProgram} or {@link CL12#clLinkProgram}
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
	public static CLProgramCallback create(final SAM sam) {
		return new CLProgramCallback() {
			@Override
			public void invoke(long program, long user_data) {
				sam.invoke(program, user_data);
			}
		};
	}

}