/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link JEmalloc#je_malloc_usable_size} method. */
public abstract class MallocMessageCallback extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(2);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.system.jemalloc.MallocMessageCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected MallocMessageCallback() {
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
	 * Will be called by the JEmalloc##je_malloc_usable_size() method.
	 *
	 * @param cbopaque the opaque pointer passed to {@link JEmalloc#je_malloc_usable_size}
	 * @param s        the message
	 */
	public abstract void invoke(long cbopaque, long s);

	/** A functional interface for {@link MallocMessageCallback}. */
	public interface SAM {
		void invoke(long cbopaque, long s);
	}

	/**
	 * Creates a {@link MallocMessageCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link MallocMessageCallback} instance
	 */
	public static MallocMessageCallback create(final SAM sam) {
		return new MallocMessageCallback() {
			@Override
			public void invoke(long cbopaque, long s) {
				sam.invoke(cbopaque, s);
			}
		};
	}

	/**
	 * Converts the specified {@link MallocMessageCallback} arguments to a String.
	 *
	 * <p>This method may only be used inside a MallocMessageCallback invocation.</p>
	 *
	 * @param s the MallocMessageCallback {@code s} argument
	 *
	 * @return the message as a String
	 */
	public static String getMessage(long s) {
		return memDecodeASCII(s);
	}

	/** A functional interface for {@link MallocMessageCallback}. */
	public interface SAMString {
		void invoke(long cbopaque, String s);
	}

	/**
	 * Creates a {@link MallocMessageCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link MallocMessageCallback} instance
	 */
	public static MallocMessageCallback createString(final SAMString sam) {
		return new MallocMessageCallback() {
			@Override
			public void invoke(long cbopaque, long s) {
				sam.invoke(cbopaque, getMessage(s));
			}
		};
	}
	
}