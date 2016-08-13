/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** A callback function used to print a message from the library. */
public abstract class MDBMsgFunc extends Callback implements MDBMsgFuncI {

	/** Creates a {@code MDBMsgFunc} instance from the specified function pointer. */
	public static MDBMsgFunc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		MDBMsgFuncI instance = Callback.get(functionPointer);
		return instance instanceof MDBMsgFunc
			? (MDBMsgFunc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code MDBMsgFunc} instance that delegates to the specified {@code MDBMsgFuncI} instance. */
	public static MDBMsgFunc create(MDBMsgFuncI instance) {
		return instance instanceof MDBMsgFunc
			? (MDBMsgFunc)instance
			: new Container(instance.address(), instance);
	}

	protected MDBMsgFunc() {
		super(SIGNATURE);
	}

	private MDBMsgFunc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends MDBMsgFunc {

		private final MDBMsgFuncI delegate;

		Container(long functionPointer, MDBMsgFuncI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(long msg, long ctx) {
			return delegate.invoke(msg, ctx);
		}

	}

}