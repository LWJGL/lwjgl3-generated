/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Image IO callbacks, used by {@link STBImage#stbi_load_from_callbacks}. */
public final class STBIIOCallbacks implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		READ,
		SKIP,
		EOF;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(3);

		SIZEOF = offsets(memAddress(offsets));

		READ = offsets.get(0);
		SKIP = offsets.get(1);
		EOF = offsets.get(2);
	}

	private final ByteBuffer struct;

	public STBIIOCallbacks() {
		this(malloc());
	}

	public STBIIOCallbacks(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setRead(long read) { read(struct, read); }
	public void setSkip(long skip) { skip(struct, skip); }
	public void setEof(long eof) { eof(struct, eof); }

	public long getRead() { return read(struct); }
	public long getSkip() { return skip(struct); }
	public long getEof() { return eof(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		long read,
		long skip,
		long eof
	) {
		ByteBuffer stbi_io_callbacks = malloc();

		read(stbi_io_callbacks, read);
		skip(stbi_io_callbacks, skip);
		eof(stbi_io_callbacks, eof);

		return stbi_io_callbacks;
	}

	public static void read(ByteBuffer stbi_io_callbacks, long read) { PointerBuffer.put(stbi_io_callbacks, stbi_io_callbacks.position() + READ, read); }
	public static void skip(ByteBuffer stbi_io_callbacks, long skip) { PointerBuffer.put(stbi_io_callbacks, stbi_io_callbacks.position() + SKIP, skip); }
	public static void eof(ByteBuffer stbi_io_callbacks, long eof) { PointerBuffer.put(stbi_io_callbacks, stbi_io_callbacks.position() + EOF, eof); }

	public static long read(ByteBuffer stbi_io_callbacks) { return PointerBuffer.get(stbi_io_callbacks, stbi_io_callbacks.position() + READ); }
	public static long skip(ByteBuffer stbi_io_callbacks) { return PointerBuffer.get(stbi_io_callbacks, stbi_io_callbacks.position() + SKIP); }
	public static long eof(ByteBuffer stbi_io_callbacks) { return PointerBuffer.get(stbi_io_callbacks, stbi_io_callbacks.position() + EOF); }

}