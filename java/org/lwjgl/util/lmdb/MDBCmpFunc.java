/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;


public abstract class MDBCmpFunc extends Callback implements MDBCmpFuncI {

	/** Creates a {@code MDBCmpFunc} instance from the specified function pointer. */
	public static MDBCmpFunc create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		MDBCmpFuncI instance = Callback.get(functionPointer);
		return instance instanceof MDBCmpFunc
			? (MDBCmpFunc)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code MDBCmpFunc} instance that delegates to the specified {@code MDBCmpFuncI} instance. */
	public static MDBCmpFunc create(MDBCmpFuncI instance) {
		return instance instanceof MDBCmpFunc
			? (MDBCmpFunc)instance
			: new Container(instance.address(), instance);
	}

	protected MDBCmpFunc() {
		super(SIGNATURE);
	}

	private MDBCmpFunc(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends MDBCmpFunc {

		private final MDBCmpFuncI delegate;

		Container(long functionPointer, MDBCmpFuncI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(long a, long b) {
			return delegate.invoke(a, b);
		}

	}

}