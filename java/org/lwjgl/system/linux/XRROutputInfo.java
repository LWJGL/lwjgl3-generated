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
		NPREFERRED;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(14);

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
	}

	private XRROutputInfo() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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
		int npreferred
	) {
		ByteBuffer xrroutputinfo = malloc();

		timestampSet(xrroutputinfo, timestamp);
		crtcSet(xrroutputinfo, crtc);
		nameSet(xrroutputinfo, name);
		nameLenSet(xrroutputinfo, nameLen);
		mm_widthSet(xrroutputinfo, mm_width);
		mm_heightSet(xrroutputinfo, mm_height);
		connectionSet(xrroutputinfo, connection);
		subpixel_orderSet(xrroutputinfo, subpixel_order);
		ncrtcSet(xrroutputinfo, ncrtc);
		crtcsSet(xrroutputinfo, crtcs);
		ncloneSet(xrroutputinfo, nclone);
		clonesSet(xrroutputinfo, clones);
		nmodeSet(xrroutputinfo, nmode);
		npreferredSet(xrroutputinfo, npreferred);

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
		int npreferred
	) {
		ByteBuffer xrroutputinfo = malloc();

		timestampSet(xrroutputinfo, timestamp);
		crtcSet(xrroutputinfo, crtc);
		nameSet(xrroutputinfo, name);
		nameLenSet(xrroutputinfo, nameLen);
		mm_widthSet(xrroutputinfo, mm_width);
		mm_heightSet(xrroutputinfo, mm_height);
		connectionSet(xrroutputinfo, connection);
		subpixel_orderSet(xrroutputinfo, subpixel_order);
		ncrtcSet(xrroutputinfo, ncrtc);
		crtcsSet(xrroutputinfo, crtcs);
		ncloneSet(xrroutputinfo, nclone);
		clonesSet(xrroutputinfo, clones);
		nmodeSet(xrroutputinfo, nmode);
		npreferredSet(xrroutputinfo, npreferred);

		return xrroutputinfo;
	}

	public static void timestampSet(ByteBuffer xrroutputinfo, long timestamp) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + TIMESTAMP, timestamp); }
	public static void crtcSet(ByteBuffer xrroutputinfo, long crtc) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + CRTC, crtc); }
	public static void nameSet(ByteBuffer xrroutputinfo, long name) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + NAME, name); }
	public static void nameSet(ByteBuffer xrroutputinfo, ByteBuffer name) { nameSet(xrroutputinfo, memAddress(name)); }
	public static void nameLenSet(ByteBuffer xrroutputinfo, int nameLen) { xrroutputinfo.putInt(xrroutputinfo.position() + NAMELEN, nameLen); }
	public static void mm_widthSet(ByteBuffer xrroutputinfo, long mm_width) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + MM_WIDTH, mm_width); }
	public static void mm_heightSet(ByteBuffer xrroutputinfo, long mm_height) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + MM_HEIGHT, mm_height); }
	public static void connectionSet(ByteBuffer xrroutputinfo, int connection) { xrroutputinfo.putShort(xrroutputinfo.position() + CONNECTION, (short)connection); }
	public static void subpixel_orderSet(ByteBuffer xrroutputinfo, int subpixel_order) { xrroutputinfo.putShort(xrroutputinfo.position() + SUBPIXEL_ORDER, (short)subpixel_order); }
	public static void ncrtcSet(ByteBuffer xrroutputinfo, int ncrtc) { xrroutputinfo.putInt(xrroutputinfo.position() + NCRTC, ncrtc); }
	public static void crtcsSet(ByteBuffer xrroutputinfo, long crtcs) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + CRTCS, crtcs); }
	public static void crtcsSet(ByteBuffer xrroutputinfo, ByteBuffer crtcs) { crtcsSet(xrroutputinfo, memAddress(crtcs)); }
	public static void ncloneSet(ByteBuffer xrroutputinfo, int nclone) { xrroutputinfo.putInt(xrroutputinfo.position() + NCLONE, nclone); }
	public static void clonesSet(ByteBuffer xrroutputinfo, long clones) { PointerBuffer.put(xrroutputinfo, xrroutputinfo.position() + CLONES, clones); }
	public static void clonesSet(ByteBuffer xrroutputinfo, ByteBuffer clones) { clonesSet(xrroutputinfo, memAddress(clones)); }
	public static void nmodeSet(ByteBuffer xrroutputinfo, int nmode) { xrroutputinfo.putInt(xrroutputinfo.position() + NMODE, nmode); }
	public static void npreferredSet(ByteBuffer xrroutputinfo, int npreferred) { xrroutputinfo.putInt(xrroutputinfo.position() + NPREFERRED, npreferred); }

	public static long timestampGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + TIMESTAMP); }
	public static long crtcGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + CRTC); }
	public static long nameGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + NAME); }
	public static ByteBuffer nameGet(ByteBuffer xrroutputinfo, int size) { long address = nameGet(xrroutputinfo); return address == 0 ? null : memByteBuffer(address, size); }
	public static int nameLenGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NAMELEN); }
	public static long mm_widthGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + MM_WIDTH); }
	public static long mm_heightGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + MM_HEIGHT); }
	public static int connectionGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getShort(xrroutputinfo.position() + CONNECTION); }
	public static int subpixel_orderGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getShort(xrroutputinfo.position() + SUBPIXEL_ORDER); }
	public static int ncrtcGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NCRTC); }
	public static long crtcsGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + CRTCS); }
	public static ByteBuffer crtcsGet(ByteBuffer xrroutputinfo, int size) { long address = crtcsGet(xrroutputinfo); return address == 0 ? null : memByteBuffer(address, size); }
	public static int ncloneGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NCLONE); }
	public static long clonesGet(ByteBuffer xrroutputinfo) { return PointerBuffer.get(xrroutputinfo, xrroutputinfo.position() + CLONES); }
	public static ByteBuffer clonesGet(ByteBuffer xrroutputinfo, int size) { long address = clonesGet(xrroutputinfo); return address == 0 ? null : memByteBuffer(address, size); }
	public static int nmodeGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NMODE); }
	public static int npreferredGet(ByteBuffer xrroutputinfo) { return xrroutputinfo.getInt(xrroutputinfo.position() + NPREFERRED); }

}