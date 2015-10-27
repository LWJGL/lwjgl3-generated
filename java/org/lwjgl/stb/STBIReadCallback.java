/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be set to the {@code read} field of the {@link STBIIOCallbacks} struct. */
public abstract class STBIReadCallback extends Closure.Int {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(3);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.stb.STBIReadCallback");

	static {
		prepareCIF(
			CALL_CONVENTION_DEFAULT,
			CIF, ffi_type_sint32,
			ARGS, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
		);
	}

	protected STBIReadCallback() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected int callback(long args) {
		return invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 2 + args))
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
	public static STBIReadCallback create(final SAM sam) {
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
	public static STBIReadCallback createBuffer(final SAMBuffer sam) {
		return new STBIReadCallback() {
			@Override
			public int invoke(long user, long data, int size) {
				return sam.invoke(user, getData(data, size));
			}
		};
	}
	
}