/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public abstract class YGLogger extends Callback implements YGLoggerI {

	/** Creates a {@code YGLogger} instance from the specified function pointer. */
	public static YGLogger create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		YGLoggerI instance = Callback.get(functionPointer);
		return instance instanceof YGLogger
			? (YGLogger)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code YGLogger} instance that delegates to the specified {@code YGLoggerI} instance. */
	public static YGLogger create(YGLoggerI instance) {
		return instance instanceof YGLogger
			? (YGLogger)instance
			: new Container(instance.address(), instance);
	}

	protected YGLogger() {
		super(SIGNATURE);
	}

	private YGLogger(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends YGLogger {

		private final YGLoggerI delegate;

		Container(long functionPointer, YGLoggerI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(int level, long format, long args) {
			return delegate.invoke(level, format, args);
		}

	}

}