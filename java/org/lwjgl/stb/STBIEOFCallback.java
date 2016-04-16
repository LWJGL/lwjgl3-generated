/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIEOFCallback extends Callback.I {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.stb.STBIEOFCallback");

	protected STBIEOFCallback() {
		super(CALL_CONVENTION_DEFAULT + "(p)i", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected int callback(long args) {
		return invoke(
			dcbArgPointer(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.eof} callback.
	 *
	 * @param user a pointer to user data
	 *
	 * @return nonzero if we are at the end of file/data
	 */
	public abstract int invoke(long user);

	/** A functional interface for {@link STBIEOFCallback}. */
	public interface SAM {
		int invoke(long user);
	}

	/**
	 * Creates a {@link STBIEOFCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIEOFCallback} instance
	 */
	public static STBIEOFCallback create(SAM sam) {
		return new STBIEOFCallback() {
			@Override
			public int invoke(long user) {
				return sam.invoke(user);
			}
		};
	}

}