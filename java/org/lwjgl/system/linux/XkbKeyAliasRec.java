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
public final class XkbKeyAliasRec implements Pointer {

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

	private final ByteBuffer struct;

	public XkbKeyAliasRec() {
		this(malloc());
	}

	public XkbKeyAliasRec(ByteBuffer struct) {
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

	public void setReal(ByteBuffer real) { realSet(struct, real); }
	public void setReal(CharSequence real) { real(struct, real); }
	public void setAlias(ByteBuffer alias) { aliasSet(struct, alias); }
	public void setAlias(CharSequence alias) { alias(struct, alias); }

	public void getReal(ByteBuffer real) { realGet(struct, real); }
	public String getRealString() { return realString(struct); }
	public void getAlias(ByteBuffer alias) { aliasGet(struct, alias); }
	public String getAliasString() { return aliasString(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer real,
		ByteBuffer alias
	) {
		ByteBuffer xkbkeyaliasrec = malloc();

		realSet(xkbkeyaliasrec, real);
		aliasSet(xkbkeyaliasrec, alias);

		return xkbkeyaliasrec;
	}

	/** Alternative virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		CharSequence real,
		CharSequence alias
	) {
		ByteBuffer xkbkeyaliasrec = malloc();

		real(xkbkeyaliasrec, real);
		alias(xkbkeyaliasrec, alias);

		return xkbkeyaliasrec;
	}

	public static void realSet(ByteBuffer xkbkeyaliasrec, ByteBuffer real) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(real);
			checkBufferGT(real, 4 * 1);
		}
		memCopy(memAddress(real), memAddress(xkbkeyaliasrec) + REAL, real.remaining());
	}
	public static void real(ByteBuffer xkbkeyaliasrec, CharSequence real) { memEncodeASCII(real, false, xkbkeyaliasrec, REAL); }
	public static void aliasSet(ByteBuffer xkbkeyaliasrec, ByteBuffer alias) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(alias);
			checkBufferGT(alias, 4 * 1);
		}
		memCopy(memAddress(alias), memAddress(xkbkeyaliasrec) + ALIAS, alias.remaining());
	}
	public static void alias(ByteBuffer xkbkeyaliasrec, CharSequence alias) { memEncodeASCII(alias, false, xkbkeyaliasrec, ALIAS); }

	public static void realGet(ByteBuffer xkbkeyaliasrec, ByteBuffer real) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(real, 4 * 1);
		memCopy(memAddress(xkbkeyaliasrec) + REAL, memAddress(real), real.remaining());
	}
	public static String realString(ByteBuffer xkbkeyaliasrec) { return memDecodeASCII(xkbkeyaliasrec, 4, REAL); }
	public static void aliasGet(ByteBuffer xkbkeyaliasrec, ByteBuffer alias) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(alias, 4 * 1);
		memCopy(memAddress(xkbkeyaliasrec) + ALIAS, memAddress(alias), alias.remaining());
	}
	public static String aliasString(ByteBuffer xkbkeyaliasrec) { return memDecodeASCII(xkbkeyaliasrec, 4, ALIAS); }

}