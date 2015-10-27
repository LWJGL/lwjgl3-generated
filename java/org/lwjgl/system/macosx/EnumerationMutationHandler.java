/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** A mutation handler. */
public abstract class EnumerationMutationHandler extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(1);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.system.macosx.EnumerationMutationHandler");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer
		);
	}

	protected EnumerationMutationHandler() {
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
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args))
		);
	}

	/**
	 * Will be called when an object is mutated during a foreach iteration.
	 *
	 * @param id the object that was mutated
	 */
	public abstract void invoke(long id);

	/** A functional interface for {@link EnumerationMutationHandler}. */
	public interface SAM {
		void invoke(long id);
	}

	/**
	 * Creates a {@link EnumerationMutationHandler} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link EnumerationMutationHandler} instance
	 */
	public static EnumerationMutationHandler create(final SAM sam) {
		return new EnumerationMutationHandler() {
			@Override
			public void invoke(long id) {
				sam.invoke(id);
			}
		};
	}

}