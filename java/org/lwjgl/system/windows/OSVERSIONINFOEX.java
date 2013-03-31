/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains operating system version information. The information includes major and minor
 * version numbers, a build number, a platform identifier, and information about product
 * suites and the latest Service Pack installed on the system.
 */
public final class OSVERSIONINFOEX {


	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		OSVERSIONINFOSIZE,
		MAJORVERSION,
		MINORVERSION,
		BUILDNUMBER,
		PLATFORMID,
		CSDVERSION,
		SERVICEPACKMAJOR,
		SERVICEPACKMINOR,
		SUITEMASK,
		PRODUCTTYPE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(10);

		SIZEOF = offsets(memAddress(offsets));

		OSVERSIONINFOSIZE = offsets.get(0);
		MAJORVERSION = offsets.get(1);
		MINORVERSION = offsets.get(2);
		BUILDNUMBER = offsets.get(3);
		PLATFORMID = offsets.get(4);
		CSDVERSION = offsets.get(5);
		SERVICEPACKMAJOR = offsets.get(6);
		SERVICEPACKMINOR = offsets.get(7);
		SUITEMASK = offsets.get(8);
		PRODUCTTYPE = offsets.get(9);
	}

	private OSVERSIONINFOEX() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int osVersionInfoSize,
		int majorVersion,
		int minorVersion,
		int buildNumber,
		int platformId,
		long csdVersion,
		int csdVersionBytes,
		int servicePackMajor,
		int servicePackMinor,
		int suiteMask,
		int productType
	) {
		ByteBuffer struct = malloc();

		osVersionInfoSizeSet(struct, osVersionInfoSize);
		majorVersionSet(struct, majorVersion);
		minorVersionSet(struct, minorVersion);
		buildNumberSet(struct, buildNumber);
		platformIdSet(struct, platformId);
		csdVersionSet(struct, csdVersion, csdVersionBytes);
		servicePackMajorSet(struct, servicePackMajor);
		servicePackMinorSet(struct, servicePackMinor);
		suiteMaskSet(struct, suiteMask);
		productTypeSet(struct, productType);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int osVersionInfoSize,
		int majorVersion,
		int minorVersion,
		int buildNumber,
		int platformId,
		ByteBuffer csdVersion,
		int servicePackMajor,
		int servicePackMinor,
		int suiteMask,
		int productType
	) {
		ByteBuffer struct = malloc();

		osVersionInfoSizeSet(struct, osVersionInfoSize);
		majorVersionSet(struct, majorVersion);
		minorVersionSet(struct, minorVersion);
		buildNumberSet(struct, buildNumber);
		platformIdSet(struct, platformId);
		csdVersionSet(struct, csdVersion);
		servicePackMajorSet(struct, servicePackMajor);
		servicePackMinorSet(struct, servicePackMinor);
		suiteMaskSet(struct, suiteMask);
		productTypeSet(struct, productType);

		return struct;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int osVersionInfoSize,
		int majorVersion,
		int minorVersion,
		int buildNumber,
		int platformId,
		CharSequence csdVersion,
		int servicePackMajor,
		int servicePackMinor,
		int suiteMask,
		int productType
	) {
		ByteBuffer struct = malloc();

		osVersionInfoSizeSet(struct, osVersionInfoSize);
		majorVersionSet(struct, majorVersion);
		minorVersionSet(struct, minorVersion);
		buildNumberSet(struct, buildNumber);
		platformIdSet(struct, platformId);
		csdVersionSet(struct, csdVersion);
		servicePackMajorSet(struct, servicePackMajor);
		servicePackMinorSet(struct, servicePackMinor);
		suiteMaskSet(struct, suiteMask);
		productTypeSet(struct, productType);

		return struct;
	}

	public static void osVersionInfoSizeSet(ByteBuffer struct, int osVersionInfoSize) { struct.putInt(struct.position() + OSVERSIONINFOSIZE, osVersionInfoSize); }
	public static void majorVersionSet(ByteBuffer struct, int majorVersion) { struct.putInt(struct.position() + MAJORVERSION, majorVersion); }
	public static void minorVersionSet(ByteBuffer struct, int minorVersion) { struct.putInt(struct.position() + MINORVERSION, minorVersion); }
	public static void buildNumberSet(ByteBuffer struct, int buildNumber) { struct.putInt(struct.position() + BUILDNUMBER, buildNumber); }
	public static void platformIdSet(ByteBuffer struct, int platformId) { struct.putInt(struct.position() + PLATFORMID, platformId); }
	public static void csdVersionSet(ByteBuffer struct, long csdVersion, int bytes) { memCopy(csdVersion, memAddress(struct) + CSDVERSION, bytes); }
	public static void csdVersionSet(ByteBuffer struct, ByteBuffer csdVersion) {
		checkNT2(csdVersion);
		checkBufferGT(csdVersion, 128 * 2);
		csdVersionSet(struct, memAddress(csdVersion), csdVersion.remaining());
	}
	public static void csdVersionSet(ByteBuffer struct, CharSequence csdVersion) { ByteBuffer buffer = memEncodeUTF16(csdVersion, true); csdVersionSet(struct, memAddress(buffer), buffer.capacity()); }
	public static void servicePackMajorSet(ByteBuffer struct, int servicePackMajor) { struct.putShort(struct.position() + SERVICEPACKMAJOR, (short)servicePackMajor); }
	public static void servicePackMinorSet(ByteBuffer struct, int servicePackMinor) { struct.putShort(struct.position() + SERVICEPACKMINOR, (short)servicePackMinor); }
	public static void suiteMaskSet(ByteBuffer struct, int suiteMask) { struct.putShort(struct.position() + SUITEMASK, (short)suiteMask); }
	public static void productTypeSet(ByteBuffer struct, int productType) { struct.put(struct.position() + PRODUCTTYPE, (byte)productType); }

	public static int osVersionInfoSizeGet(ByteBuffer struct) { return struct.getInt(struct.position() + OSVERSIONINFOSIZE); }
	public static int majorVersionGet(ByteBuffer struct) { return struct.getInt(struct.position() + MAJORVERSION); }
	public static int minorVersionGet(ByteBuffer struct) { return struct.getInt(struct.position() + MINORVERSION); }
	public static int buildNumberGet(ByteBuffer struct) { return struct.getInt(struct.position() + BUILDNUMBER); }
	public static int platformIdGet(ByteBuffer struct) { return struct.getInt(struct.position() + PLATFORMID); }
	public static void csdVersionGet(ByteBuffer struct, long csdVersion, int bytes) {
		memCopy(memAddress(struct) + CSDVERSION, csdVersion, bytes);
	}
	public static void csdVersionGetb(ByteBuffer struct, ByteBuffer csdVersion) {
		checkBufferGT(csdVersion, 128 * 2);
		csdVersionGet(struct, memAddress(csdVersion), csdVersion.remaining());
	}
	public static String csdVersionGets(ByteBuffer struct) { return memDecodeUTF16(memByteBufferNT2(memAddress(struct) + CSDVERSION)); }
	public static String csdVersionGets(ByteBuffer struct, int size) { return memDecodeUTF16(memByteBuffer(memAddress(struct) + CSDVERSION, size)); }
	public static int servicePackMajorGet(ByteBuffer struct) { return struct.getShort(struct.position() + SERVICEPACKMAJOR); }
	public static int servicePackMinorGet(ByteBuffer struct) { return struct.getShort(struct.position() + SERVICEPACKMINOR); }
	public static int suiteMaskGet(ByteBuffer struct) { return struct.getShort(struct.position() + SUITEMASK); }
	public static int productTypeGet(ByteBuffer struct) { return struct.get(struct.position() + PRODUCTTYPE); }

}