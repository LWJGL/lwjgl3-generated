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

/** Xrandr output info struct. */
public final class XRROutputInfo {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TIMESTAMP,
		CRTC,
		NAME,
		NAMELEN,
		MM_WIDTH,
		MM_HEIGHT,
		CONNECTION,
		SUBPIXEL_ORDER,
		NCRTC,
		CRTCS,
		NCLONE,
		CLONES,
		NMODE,
		NPREFERRED,
		MODES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(15);

		SIZEOF = offsets(memAddress(offsets));

		TIMESTAMP = offsets.get(0);
		CRTC = offsets.get(1);
		NAME = offsets.get(2);
		NAMELEN = offsets.get(3);
		MM_WIDTH = offsets.get(4);
		MM_HEIGHT = offsets.get(5);
		CONNECTION = offsets.get(6);
		SUBPIXEL_ORDER = offsets.get(7);
		NCRTC = offsets.get(8);
		CRTCS = offsets.get(9);
		NCLONE = offsets.get(10);
		CLONES = offsets.get(11);
		NMODE = offsets.get(12);
		NPREFERRED = offsets.get(13);
		MODES = offsets.get(14);
	}

	private XRROutputInfo() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		long timestamp,
		long crtc,
		long name,
		int nameLen,
		long mm_width,
		long mm_height,
		int connection,
		int subpixel_order,
		int ncrtc,
		long crtcs,
		int nclone,
		long clones,
		int nmode,
		int npreferred,
		long modes
	) {
		ByteBuffer xrroutputinfo = malloc();

		timestamp(xrroutputinfo, timestamp);
		crtc(xrroutputinfo, crtc);
		name(xrroutputinfo, name);
		nameLen(xrroutputinfo, nameLen);
		mm_width(xrroutputinfo, mm_width);
		mm_height(xrroutputinfo, mm_height);
		connection(xrroutputinfo, connection);
		subpixel_order(xrroutputinfo, subpixel_order);
		ncrtc(xrroutputinfo, ncrtc);
		crtcs(xrroutputinfo, crtcs);
		nclone(xrroutputinfo, nclone);
		clones(xrroutputinfo, clones);
		nmode(xrroutputinfo, nmode);
		npreferred(xrroutputinfo, npreferred);
		modes(xrroutputinfo, modes);

		return xrroutputinfo;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		long timestamp,
		long crtc,
		ByteBuffer name,
		int nameLen,
		long mm_width,
		long mm_height,
		int connection,
		int subpixel_order,
		int ncrtc,
		ByteBuffer crtcs,
		int nclone,
		ByteBuffer clones,
		int nmode,
		int npreferred,
		ByteBuffer modes
	) {
		ByteBuffer xrroutputinfo = malloc();

		timestamp(xrroutputinfo, timestamp);
		crtc(xrroutputinfo, crtc);
		name(xrroutputinfo, name);
		nameLen(xrroutputinfo, nameLen);
		mm_width(xrroutputinfo, mm_width);
		mm_height(xrroutputinfo, mm_height);
		connection(xrroutputinfo, connection);
		subpixel_order(xrroutputinfo, subpixel_order);
		ncrtc(xrroutputinfo, ncrtc);
		crtcs(xrroutputinfo, crtcs);
		nclone(xrroutputinfo, nclone);
		clones(xrroutputinfo, clones);
		nmode(xrroutputinfo, nmode);
		npreferred(xrroutputinfo, npreferred);
		modes(xrroutputinfo, modes);

		return xrroutputinfo;
	}

	public static void timestamp(ByteBuffer xrroutputinfo, long timestamp) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + TIMESTAMP, timestamp); }
	public static void crtc(ByteBuffer xrroutputinfo, long crtc) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + CRTC, crtc); }
	public static void name(ByteBuffer xrroutputinfo, long name) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + NAME, name); }
	public static void name(ByteBuffer xrroutputinfo, ByteBuffer name) { name(xrroutputinfo, memAddress(name)); }
	public static void nameLen(ByteBuffer xrroutputinfo, int nameLen) { xrroutputinfo.putInt(xrroutputinfo.position() + NAMELEN, nameLen); }
	public static void mm_width(ByteBuffer xrroutputinfo, long mm_width) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + MM_WIDTH, mm_width); }
	public static void mm_height(ByteBuffer xrroutputinfo, long mm_height) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + MM_HEIGHT, mm_height); }
	public static void connection(ByteBuffer xrroutputinfo, int connection) { xrroutputinfo.putShort(xrroutputinfo.position() + CONNECTION, (short)connection); }
	public static void subpixel_order(ByteBuffer xrroutputinfo, int subpixel_order) { xrroutputinfo.putShort(xrroutputinfo.position() + SUBPIXEL_ORDER, (short)subpixel_order); }
	public static void ncrtc(ByteBuffer xrroutputinfo, int ncrtc) { xrroutputinfo.putInt(xrroutputinfo.position() + NCRTC, ncrtc); }
	public static void crtcs(ByteBuffer xrroutputinfo, long crtcs) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + CRTCS, crtcs); }
	public static void crtcs(ByteBuffer xrroutputinfo, ByteBuffer crtcs) { crtcs(xrroutputinfo, memAddress(crtcs)); }
	public static void nclone(ByteBuffer xrroutputinfo, int nclone) { xrroutputinfo.putInt(xrroutputinfo.position() + NCLONE, nclone); }
	public static void clones(ByteBuffer xrroutputinfo, long clones) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + CLONES, clones); }
	public static void clones(ByteBuffer xrroutputinfo, ByteBuffer clones) { clones(xrroutputinfo, memAddress(clones)); }
	public static void nmode(ByteBuffer xrroutputinfo, int nmode) { xrroutputinfo.putInt(xrroutputinfo.position() + NMODE, nmode); }
	public static void npreferred(ByteBuffer xrroutputinfo, int npreferred) { xrroutputinfo.putInt(xrroutputinfo.position() + NPREFERRED, npreferred); }
	public static void modes(ByteBuffer xrroutputinfo, long modes) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + MODES, modes); }
	public static void modes(ByteBuffer xrroutputinfo, ByteBuffer modes) { modes(xrroutputinfo, memAddress(modes)); }

	public static long timestamp(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + TIMESTAMP); }
	public static long crtc(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + CRTC); }
	public static long name(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + NAME); }
	public static ByteBuffer name(ByteBuffer xrroutputinfo, int size) { long address = name(xrroutputinfo); return address == NULL ? null : memByteBuffer(address, size); }
	public static int nameLen(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NAMELEN); }
	public static long mm_width(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + MM_WIDTH); }
	public static long mm_height(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + MM_HEIGHT); }
	public static int connection(ByteBuffer xrroutputinfo) { return xrroutputinfo.getShort(xrroutputinfo.position() + CONNECTION) & 0xFFFF; }
	public static int subpixel_order(ByteBuffer xrroutputinfo) { return xrroutputinfo.getShort(xrroutputinfo.position() + SUBPIXEL_ORDER) & 0xFFFF; }
	public static int ncrtc(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NCRTC); }
	public static long crtcs(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + CRTCS); }
	public static ByteBuffer crtcs(ByteBuffer xrroutputinfo, int size) { long address = crtcs(xrroutputinfo); return address == NULL ? null : memByteBuffer(address, size); }
	public static int nclone(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NCLONE); }
	public static long clones(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + CLONES); }
	public static ByteBuffer clones(ByteBuffer xrroutputinfo, int size) { long address = clones(xrroutputinfo); return address == NULL ? null : memByteBuffer(address, size); }
	public static int nmode(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NMODE); }
	public static int npreferred(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NPREFERRED); }
	public static long modes(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + MODES); }
	public static ByteBuffer modes(ByteBuffer xrroutputinfo, int size) { long address = modes(xrroutputinfo); return address == NULL ? null : memByteBuffer(address, size); }

}