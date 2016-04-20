/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct. */
@FunctionalInterface
public interface OVRLogCallback extends Callback.V {

	/** Creates a {@code OVRLogCallback} instance from the specified function pointer. */
	static OVRLogCallback create(long functionPointer) {
		return functionPointer == NULL ? null : new OVRLogCallbackHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code OVRLogCallback} instance that delegates to the specified {@code OVRLogCallback} instance. */
	static OVRLogCallback create(OVRLogCallback sam) {
		return new OVRLogCallbackHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pip)v", false);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * The logging callback.
	 *
	 * @param userData an arbitrary value specified by the user of ovrInitParams
	 * @param level    one of the {@code ovrLogLevel} constants
	 * @param message  a UTF8-encoded null-terminated string
	 */
	void invoke(long userData, int level, long message);

	/**
	 * Converts the specified {@link OVRLogCallback} argument to a String.
	 *
	 * <p>This method may only be used inside a OVRLogCallback invocation.</p>
	 *
	 * @param message the OVRLogCallback {@code message} argument
	 *
	 * @return the message as a String
	 */
	static String getMessage(long message) {
		return memUTF8(message);
	}

}

final class OVRLogCallbackHandle extends Pointer.Default implements OVRLogCallback {

	private final OVRLogCallback delegate;

	OVRLogCallbackHandle(long functionPointer, OVRLogCallback delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long userData, int level, long message) {
		delegate.invoke(userData, level, message);
	}

}