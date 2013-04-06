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
		ByteBuffer osversioninfoex = malloc();

		osVersionInfoSizeSet(osversioninfoex, osVersionInfoSize);
		majorVersionSet(osversioninfoex, majorVersion);
		minorVersionSet(osversioninfoex, minorVersion);
		buildNumberSet(osversioninfoex, buildNumber);
		platformIdSet(osversioninfoex, platformId);
		csdVersionSet(osversioninfoex, csdVersion, csdVersionBytes);
		servicePackMajorSet(osversioninfoex, servicePackMajor);
		servicePackMinorSet(osversioninfoex, servicePackMinor);
		suiteMaskSet(osversioninfoex, suiteMask);
		productTypeSet(osversioninfoex, productType);

		return osversioninfoex;
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
		ByteBuffer osversioninfoex = malloc();

		osVersionInfoSizeSet(osversioninfoex, osVersionInfoSize);
		majorVersionSet(osversioninfoex, majorVersion);
		minorVersionSet(osversioninfoex, minorVersion);
		buildNumberSet(osversioninfoex, buildNumber);
		platformIdSet(osversioninfoex, platformId);
		csdVersionSet(osversioninfoex, csdVersion);
		servicePackMajorSet(osversioninfoex, servicePackMajor);
		servicePackMinorSet(osversioninfoex, servicePackMinor);
		suiteMaskSet(osversioninfoex, suiteMask);
		productTypeSet(osversioninfoex, productType);

		return osversioninfoex;
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
		ByteBuffer osversioninfoex = malloc();

		osVersionInfoSizeSet(osversioninfoex, osVersionInfoSize);
		majorVersionSet(osversioninfoex, majorVersion);
		minorVersionSet(osversioninfoex, minorVersion);
		buildNumberSet(osversioninfoex, buildNumber);
		platformIdSet(osversioninfoex, platformId);
		csdVersionSet(osversioninfoex, csdVersion);
		servicePackMajorSet(osversioninfoex, servicePackMajor);
		servicePackMinorSet(osversioninfoex, servicePackMinor);
		suiteMaskSet(osversioninfoex, suiteMask);
		productTypeSet(osversioninfoex, productType);

		return osversioninfoex;
	}

	public static void osVersionInfoSizeSet(ByteBuffer osversioninfoex, int osVersionInfoSize) { osversioninfoex.putInt(osversioninfoex.position() + OSVERSIONINFOSIZE, osVersionInfoSize); }
	public static void majorVersionSet(ByteBuffer osversioninfoex, int majorVersion) { osversioninfoex.putInt(osversioninfoex.position() + MAJORVERSION, majorVersion); }
	public static void minorVersionSet(ByteBuffer osversioninfoex, int minorVersion) { osversioninfoex.putInt(osversioninfoex.position() + MINORVERSION, minorVersion); }
	public static void buildNumberSet(ByteBuffer osversioninfoex, int buildNumber) { osversioninfoex.putInt(osversioninfoex.position() + BUILDNUMBER, buildNumber); }
	public static void platformIdSet(ByteBuffer osversioninfoex, int platformId) { osversioninfoex.putInt(osversioninfoex.position() + PLATFORMID, platformId); }
	public static void csdVersionSet(ByteBuffer osversioninfoex, long csdVersion, int bytes) { memCopy(csdVersion, memAddress(osversioninfoex) + CSDVERSION, bytes); }
	public static void csdVersionSet(ByteBuffer osversioninfoex, ByteBuffer csdVersion) {
		checkNT2(csdVersion);
		checkBufferGT(csdVersion, 128 * 2);
		csdVersionSet(osversioninfoex, memAddress(csdVersion), csdVersion.remaining());
	}
	public static void csdVersionSet(ByteBuffer osversioninfoex, CharSequence csdVersion) { ByteBuffer buffer = memEncodeUTF16(csdVersion, true); csdVersionSet(osversioninfoex, memAddress(buffer), buffer.capacity()); }
	public static void servicePackMajorSet(ByteBuffer osversioninfoex, int servicePackMajor) { osversioninfoex.putShort(osversioninfoex.position() + SERVICEPACKMAJOR, (short)servicePackMajor); }
	public static void servicePackMinorSet(ByteBuffer osversioninfoex, int servicePackMinor) { osversioninfoex.putShort(osversioninfoex.position() + SERVICEPACKMINOR, (short)servicePackMinor); }
	public static void suiteMaskSet(ByteBuffer osversioninfoex, int suiteMask) { osversioninfoex.putShort(osversioninfoex.position() + SUITEMASK, (short)suiteMask); }
	public static void productTypeSet(ByteBuffer osversioninfoex, int productType) { osversioninfoex.put(osversioninfoex.position() + PRODUCTTYPE, (byte)productType); }

	public static int osVersionInfoSizeGet(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + OSVERSIONINFOSIZE); }
	public static int majorVersionGet(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + MAJORVERSION); }
	public static int minorVersionGet(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + MINORVERSION); }
	public static int buildNumberGet(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + BUILDNUMBER); }
	public static int platformIdGet(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + PLATFORMID); }
	public static void csdVersionGet(ByteBuffer osversioninfoex, long csdVersion, int bytes) {
		memCopy(memAddress(osversioninfoex) + CSDVERSION, csdVersion, bytes);
	}
	public static void csdVersionGetb(ByteBuffer osversioninfoex, ByteBuffer csdVersion) {
		checkBufferGT(csdVersion, 128 * 2);
		csdVersionGet(osversioninfoex, memAddress(csdVersion), csdVersion.remaining());
	}
	public static String csdVersionGets(ByteBuffer osversioninfoex) { return memDecodeUTF16(osversioninfoex, memStrLen2(osversioninfoex, CSDVERSION), CSDVERSION); }
	public static String csdVersionGets(ByteBuffer osversioninfoex, int size) { return memDecodeUTF16(osversioninfoex, size, CSDVERSION); }
	public static int servicePackMajorGet(ByteBuffer osversioninfoex) { return osversioninfoex.getShort(osversioninfoex.position() + SERVICEPACKMAJOR); }
	public static int servicePackMinorGet(ByteBuffer osversioninfoex) { return osversioninfoex.getShort(osversioninfoex.position() + SERVICEPACKMINOR); }
	public static int suiteMaskGet(ByteBuffer osversioninfoex) { return osversioninfoex.getShort(osversioninfoex.position() + SUITEMASK); }
	public static int productTypeGet(ByteBuffer osversioninfoex) { return osversioninfoex.get(osversioninfoex.position() + PRODUCTTYPE); }

}