/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** A mutation handler. */
public abstract class EnumerationMutationHandler extends Callback implements EnumerationMutationHandlerI {

	/** Creates a {@code EnumerationMutationHandler} instance from the specified function pointer. */
	public static EnumerationMutationHandler create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		EnumerationMutationHandlerI instance = Callback.get(functionPointer);
		return instance instanceof EnumerationMutationHandler
			? (EnumerationMutationHandler)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code EnumerationMutationHandler} instance that delegates to the specified {@code EnumerationMutationHandlerI} instance. */
	public static EnumerationMutationHandler create(EnumerationMutationHandlerI instance) {
		return instance instanceof EnumerationMutationHandler
			? (EnumerationMutationHandler)instance
			: new Container(instance.address(), instance);
	}

	protected EnumerationMutationHandler() {
		super(NULL);
		address = EnumerationMutationHandlerI.super.address();
	}

	private EnumerationMutationHandler(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends EnumerationMutationHandler {

		private final EnumerationMutationHandlerI delegate;

		Container(long functionPointer, EnumerationMutationHandlerI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long id) {
			delegate.invoke(id);
		}

	}

}