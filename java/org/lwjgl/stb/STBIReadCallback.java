/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be set to the {@code read} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIReadCallback extends Callback.I {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.stb.STBIReadCallback");

	protected STBIReadCallback() {
		super(CALL_CONVENTION_DEFAULT + "(ppi)i", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected int callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * The {@code stbi_io_callbacks.read} callback.
	 *
	 * @param user a pointer to user data
	 * @param data the data buffer to fill
	 * @param size the number of bytes to read
	 *
	 * @return the number of bytes actually read
	 */
	public abstract int invoke(long user, long data, int size);

	/** A functional interface for {@link STBIReadCallback}. */
	public interface SAM {
		int invoke(long user, long data, int size);
	}

	/**
	 * Creates a {@link STBIReadCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIReadCallback} instance
	 */
	public static STBIReadCallback create(SAM sam) {
		return new STBIReadCallback() {
			@Override
			public int invoke(long user, long data, int size) {
				return sam.invoke(user, data, size);
			}
		};
	}

	/**
	 * Converts the specified {@link STBIReadCallback} arguments to a ByteBuffer.
	 *
	 * <p>This method may only be used inside a STBIReadCallback invocation.</p>
	 *
	 * @param data the STBIReadCallback {@code data} argument
	 * @param size the STBIReadCallback {@code size} argument
	 *
	 * @return the data as a ByteBuffer
	 */
	public static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

	/** A functional interface for {@link STBIReadCallback}. */
	public interface SAMBuffer {
		int invoke(long user, ByteBuffer data);
	}

	/**
	 * Creates a {@link STBIReadCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIReadCallback} instance
	 */
	public static STBIReadCallback createBuffer(SAMBuffer sam) {
		return new STBIReadCallback() {
			@Override
			public int invoke(long user, long data, int size) {
				return sam.invoke(user, getData(data, size));
			}
		};
	}

}