/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** A mutation handler. */
public abstract class EnumerationMutationHandler extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.system.macosx.EnumerationMutationHandler");

	protected EnumerationMutationHandler() {
		super(CALL_CONVENTION_DEFAULT + "(p)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args)
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
	public static EnumerationMutationHandler create(SAM sam) {
		return new EnumerationMutationHandler() {
			@Override
			public void invoke(long id) {
				sam.invoke(id);
			}
		};
	}

}