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

/** Instances of this interface may be passed to the {@link CL11#clSetMemObjectDestructorCallback} method. */
public abstract class CLMemObjectDestructorCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.opencl.CLMemObjectDestructorCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected CLMemObjectDestructorCallback() {
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
	 * Will be called when a memory object is deleted.
	 *
	 * @param memobj    the memory object that was deleted
	 * @param user_data the user-specified value that was passed when calling {@link CL11#clSetMemObjectDestructorCallback}
	 */
	public abstract void invoke(long memobj, long user_data);

	/** A functional interface for {@link CLMemObjectDestructorCallback}. */
	public interface SAM {
		void invoke(long memobj, long user_data);
	}

	/**
	 * Creates a {@link CLMemObjectDestructorCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLMemObjectDestructorCallback} instance
	 */
	public static CLMemObjectDestructorCallback create(final SAM sam) {
		return new CLMemObjectDestructorCallback() {
			@Override
			public void invoke(long memobj, long user_data) {
				sam.invoke(memobj, user_data);
			}
		};
	}

}