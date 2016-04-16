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

/** Instances of this interface may be used with the {@link STBImageWrite} {@code write_type_to_func} functions. */
public abstract class STBIWriteCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.stb.STBIWriteCallback");

	protected STBIWriteCallback() {
		super(CALL_CONVENTION_DEFAULT + "(ppi)v", CLASSPATH);
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
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * The {@code stbi_write_func} callback.
	 *
	 * @param context the context passed to the write function
	 * @param data    the data to write
	 * @param size    the number of bytes in {@code data}
	 */
	public abstract void invoke(long context, long data, int size);

	/** A functional interface for {@link STBIWriteCallback}. */
	public interface SAM {
		void invoke(long context, long data, int size);
	}

	/**
	 * Creates a {@link STBIWriteCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIWriteCallback} instance
	 */
	public static STBIWriteCallback create(SAM sam) {
		return new STBIWriteCallback() {
			@Override
			public void invoke(long context, long data, int size) {
				sam.invoke(context, data, size);
			}
		};
	}

	/**
	 * Converts the specified {@link STBIWriteCallback} arguments to a ByteBuffer.
	 *
	 * <p>This method may only be used inside a STBIWriteCallback invocation.</p>
	 *
	 * @param data the STBIWriteCallback {@code data} argument
	 * @param size the STBIWriteCallback {@code size} argument
	 *
	 * @return the data as a ByteBuffer
	 */
	public static ByteBuffer getData(long data, int size) {
		return memByteBuffer(data, size);
	}

	/** A functional interface for {@link STBIWriteCallback}. */
	public interface SAMBuffer {
		int invoke(long context, ByteBuffer data);
	}

	/**
	 * Creates a {@link STBIWriteCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link STBIWriteCallback} instance
	 */
	public static STBIWriteCallback createBuffer(SAMBuffer sam) {
		return new STBIWriteCallback() {
			@Override
			public void invoke(long context, long data, int size) {
				sam.invoke(context, getData(data, size));
			}
		};
	}

}