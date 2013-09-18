/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Xkb key alias record. */
public final class XkbKeyAliasRec {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		REAL,
		ALIAS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		REAL = offsets.get(0);
		ALIAS = offsets.get(1);
	}

	private XkbKeyAliasRec() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long real,
		int realBytes,
		long alias,
		int aliasBytes
	) {
		ByteBuffer xkbkeyaliasrec = malloc();

		realSet(xkbkeyaliasrec, real, realBytes);
		aliasSet(xkbkeyaliasrec, alias, aliasBytes);

		return xkbkeyaliasrec;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		ByteBuffer real,
		ByteBuffer alias
	) {
		ByteBuffer xkbkeyaliasrec = malloc();

		realSet(xkbkeyaliasrec, real);
		aliasSet(xkbkeyaliasrec, alias);

		return xkbkeyaliasrec;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		CharSequence real,
		CharSequence alias
	) {
		ByteBuffer xkbkeyaliasrec = malloc();

		realSet(xkbkeyaliasrec, real);
		aliasSet(xkbkeyaliasrec, alias);

		return xkbkeyaliasrec;
	}

	public static void realSet(ByteBuffer xkbkeyaliasrec, long real, int bytes) { memCopy(real, memAddress(xkbkeyaliasrec) + REAL, bytes); }
	public static void realSet(ByteBuffer xkbkeyaliasrec, ByteBuffer real) {
		checkNT1(real);
		checkBufferGT(real, 4 * 1);
		realSet(xkbkeyaliasrec, memAddress(real), real.remaining());
	}
	public static void realSet(ByteBuffer xkbkeyaliasrec, CharSequence real) { ByteBuffer buffer = memEncodeASCII(real, false); realSet(xkbkeyaliasrec, memAddress(buffer), buffer.capacity()); }
	public static void aliasSet(ByteBuffer xkbkeyaliasrec, long alias, int bytes) { memCopy(alias, memAddress(xkbkeyaliasrec) + ALIAS, bytes); }
	public static void aliasSet(ByteBuffer xkbkeyaliasrec, ByteBuffer alias) {
		checkNT1(alias);
		checkBufferGT(alias, 4 * 1);
		aliasSet(xkbkeyaliasrec, memAddress(alias), alias.remaining());
	}
	public static void aliasSet(ByteBuffer xkbkeyaliasrec, CharSequence alias) { ByteBuffer buffer = memEncodeASCII(alias, false); aliasSet(xkbkeyaliasrec, memAddress(buffer), buffer.capacity()); }

	public static void realGet(ByteBuffer xkbkeyaliasrec, long real, int bytes) {
		memCopy(memAddress(xkbkeyaliasrec) + REAL, real, bytes);
	}
	public static void realGet(ByteBuffer xkbkeyaliasrec, ByteBuffer real) {
		checkBufferGT(real, 4 * 1);
		realGet(xkbkeyaliasrec, memAddress(real), real.remaining());
	}
	public static String realGets(ByteBuffer xkbkeyaliasrec) { return memDecodeASCII(xkbkeyaliasrec, 4, REAL); }
	public static void aliasGet(ByteBuffer xkbkeyaliasrec, long alias, int bytes) {
		memCopy(memAddress(xkbkeyaliasrec) + ALIAS, alias, bytes);
	}
	public static void aliasGet(ByteBuffer xkbkeyaliasrec, ByteBuffer alias) {
		checkBufferGT(alias, 4 * 1);
		aliasGet(xkbkeyaliasrec, memAddress(alias), alias.remaining());
	}
	public static String aliasGets(ByteBuffer xkbkeyaliasrec) { return memDecodeASCII(xkbkeyaliasrec, 4, ALIAS); }

}