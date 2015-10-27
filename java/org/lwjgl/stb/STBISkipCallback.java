/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBISkipCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.stb.STBISkipCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected STBISkipCallback() {
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
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args))
		);
	}

	/**
	 * The {@code stbi_io_callbacks.skip} callback.
	 *
	 * @param user a pointer to user data
	 * @param n    the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative
	 */
	public abstract void invoke(long user, int n);

	/** A functional interface for {@link STBISkipCallback}. */
	public interface SAM {
		void invoke(long user, int n);
	}

	/**
	 * Creates a {@link STBISkipCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBISkipCallback} instance
	 */
	public static STBISkipCallback create(final SAM sam) {
		return new STBISkipCallback() {
			@Override
			public void invoke(long user, int n) {
				sam.invoke(user, n);
			}
		};
	}

}