/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBISkipCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.stb.STBISkipCallback");

	protected STBISkipCallback() {
		super(CALL_CONVENTION_DEFAULT + "(pi)v", CLASSPATH);
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
			dcbArgInt(args)
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
	public static STBISkipCallback create(SAM sam) {
		return new STBISkipCallback() {
			@Override
			public void invoke(long user, int n) {
				sam.invoke(user, n);
			}
		};
	}

}