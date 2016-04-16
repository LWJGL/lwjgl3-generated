/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method. */
public abstract class MallocMessageCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.jemalloc.MallocMessageCallback");

	protected MallocMessageCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pp)v", CLASSPATH);
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
	 * Will be called by the {@link JEmalloc#je_malloc_usable_size malloc_usable_size} method.
	 *
	 * @param cbopaque the opaque pointer passed to {@link JEmalloc#je_malloc_usable_size malloc_usable_size}
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
	public static MallocMessageCallback create(SAM sam) {
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
		return memASCII(s);
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
	public static MallocMessageCallback createString(SAMString sam) {
		return new MallocMessageCallback() {
			@Override
			public void invoke(long cbopaque, long s) {
				sam.invoke(cbopaque, getMessage(s));
			}
		};
	}

}