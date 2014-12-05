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
public final class OSVERSIONINFOEX implements Pointer {

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

	private final ByteBuffer struct;

	public OSVERSIONINFOEX() {
		this(malloc());
	}

	public OSVERSIONINFOEX(ByteBuffer struct) {
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

	public void setOsVersionInfoSize(int osVersionInfoSize) { osVersionInfoSize(struct, osVersionInfoSize); }
	public void setMajorVersion(int majorVersion) { majorVersion(struct, majorVersion); }
	public void setMinorVersion(int minorVersion) { minorVersion(struct, minorVersion); }
	public void setBuildNumber(int buildNumber) { buildNumber(struct, buildNumber); }
	public void setPlatformId(int platformId) { platformId(struct, platformId); }
	public void setCsdVersion(long csdVersion, int bytes) { csdVersionSet(struct, csdVersion, bytes); }
	public void setCsdVersion(ByteBuffer csdVersion) { csdVersionSet(struct, csdVersion); }
	public void setCsdVersion(CharSequence csdVersion) { csdVersionSet(struct, csdVersion); }
	public void setServicePackMajor(int servicePackMajor) { servicePackMajor(struct, servicePackMajor); }
	public void setServicePackMinor(int servicePackMinor) { servicePackMinor(struct, servicePackMinor); }
	public void setSuiteMask(int suiteMask) { suiteMask(struct, suiteMask); }
	public void setProductType(int productType) { productType(struct, productType); }

	public int getOsVersionInfoSize() { return osVersionInfoSize(struct); }
	public int getMajorVersion() { return majorVersion(struct); }
	public int getMinorVersion() { return minorVersion(struct); }
	public int getBuildNumber() { return buildNumber(struct); }
	public int getPlatformId() { return platformId(struct); }
	public void getCsdVersion(long csdVersion, int bytes) { csdVersionGet(struct, csdVersion, bytes); }
	public void getCsdVersion(ByteBuffer csdVersion) { csdVersionGet(struct, csdVersion); }
	public String getCsdVersionStr() { return csdVersionGets(struct); }
	public String getCsdVersionStr(int size) { return csdVersionGets(struct, size); }
	public int getServicePackMajor() { return servicePackMajor(struct); }
	public int getServicePackMinor() { return servicePackMinor(struct); }
	public int getSuiteMask() { return suiteMask(struct); }
	public int getProductType() { return productType(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		osVersionInfoSize(osversioninfoex, osVersionInfoSize);
		majorVersion(osversioninfoex, majorVersion);
		minorVersion(osversioninfoex, minorVersion);
		buildNumber(osversioninfoex, buildNumber);
		platformId(osversioninfoex, platformId);
		csdVersionSet(osversioninfoex, csdVersion, csdVersionBytes);
		servicePackMajor(osversioninfoex, servicePackMajor);
		servicePackMinor(osversioninfoex, servicePackMinor);
		suiteMask(osversioninfoex, suiteMask);
		productType(osversioninfoex, productType);

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

		osVersionInfoSize(osversioninfoex, osVersionInfoSize);
		majorVersion(osversioninfoex, majorVersion);
		minorVersion(osversioninfoex, minorVersion);
		buildNumber(osversioninfoex, buildNumber);
		platformId(osversioninfoex, platformId);
		csdVersionSet(osversioninfoex, csdVersion);
		servicePackMajor(osversioninfoex, servicePackMajor);
		servicePackMinor(osversioninfoex, servicePackMinor);
		suiteMask(osversioninfoex, suiteMask);
		productType(osversioninfoex, productType);

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

		osVersionInfoSize(osversioninfoex, osVersionInfoSize);
		majorVersion(osversioninfoex, majorVersion);
		minorVersion(osversioninfoex, minorVersion);
		buildNumber(osversioninfoex, buildNumber);
		platformId(osversioninfoex, platformId);
		csdVersionSet(osversioninfoex, csdVersion);
		servicePackMajor(osversioninfoex, servicePackMajor);
		servicePackMinor(osversioninfoex, servicePackMinor);
		suiteMask(osversioninfoex, suiteMask);
		productType(osversioninfoex, productType);

		return osversioninfoex;
	}

	public static void osVersionInfoSize(ByteBuffer osversioninfoex, int osVersionInfoSize) { osversioninfoex.putInt(osversioninfoex.position() + OSVERSIONINFOSIZE, osVersionInfoSize); }
	public static void majorVersion(ByteBuffer osversioninfoex, int majorVersion) { osversioninfoex.putInt(osversioninfoex.position() + MAJORVERSION, majorVersion); }
	public static void minorVersion(ByteBuffer osversioninfoex, int minorVersion) { osversioninfoex.putInt(osversioninfoex.position() + MINORVERSION, minorVersion); }
	public static void buildNumber(ByteBuffer osversioninfoex, int buildNumber) { osversioninfoex.putInt(osversioninfoex.position() + BUILDNUMBER, buildNumber); }
	public static void platformId(ByteBuffer osversioninfoex, int platformId) { osversioninfoex.putInt(osversioninfoex.position() + PLATFORMID, platformId); }
	public static void csdVersionSet(ByteBuffer osversioninfoex, long csdVersion, int bytes) { memCopy(csdVersion, memAddress(osversioninfoex) + CSDVERSION, bytes); }
	public static void csdVersionSet(ByteBuffer osversioninfoex, ByteBuffer csdVersion) {
		checkNT2(csdVersion);
		checkBufferGT(csdVersion, 128 * 2);
		csdVersionSet(osversioninfoex, memAddress(csdVersion), csdVersion.remaining());
	}
	public static void csdVersionSet(ByteBuffer osversioninfoex, CharSequence csdVersion) { ByteBuffer buffer = memEncodeUTF16(csdVersion, true); csdVersionSet(osversioninfoex, memAddress(buffer), buffer.capacity()); }
	public static void servicePackMajor(ByteBuffer osversioninfoex, int servicePackMajor) { osversioninfoex.putShort(osversioninfoex.position() + SERVICEPACKMAJOR, (short)servicePackMajor); }
	public static void servicePackMinor(ByteBuffer osversioninfoex, int servicePackMinor) { osversioninfoex.putShort(osversioninfoex.position() + SERVICEPACKMINOR, (short)servicePackMinor); }
	public static void suiteMask(ByteBuffer osversioninfoex, int suiteMask) { osversioninfoex.putShort(osversioninfoex.position() + SUITEMASK, (short)suiteMask); }
	public static void productType(ByteBuffer osversioninfoex, int productType) { osversioninfoex.put(osversioninfoex.position() + PRODUCTTYPE, (byte)productType); }

	public static int osVersionInfoSize(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + OSVERSIONINFOSIZE); }
	public static int majorVersion(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + MAJORVERSION); }
	public static int minorVersion(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + MINORVERSION); }
	public static int buildNumber(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + BUILDNUMBER); }
	public static int platformId(ByteBuffer osversioninfoex) { return osversioninfoex.getInt(osversioninfoex.position() + PLATFORMID); }
	public static void csdVersionGet(ByteBuffer osversioninfoex, long csdVersion, int bytes) {
		memCopy(memAddress(osversioninfoex) + CSDVERSION, csdVersion, bytes);
	}
	public static void csdVersionGet(ByteBuffer osversioninfoex, ByteBuffer csdVersion) {
		checkBufferGT(csdVersion, 128 * 2);
		csdVersionGet(osversioninfoex, memAddress(csdVersion), csdVersion.remaining());
	}
	public static String csdVersionGets(ByteBuffer osversioninfoex) { return memDecodeUTF16(osversioninfoex, memStrLen2(osversioninfoex, CSDVERSION), CSDVERSION); }
	public static String csdVersionGets(ByteBuffer osversioninfoex, int size) { return memDecodeUTF16(osversioninfoex, size, CSDVERSION); }
	public static int servicePackMajor(ByteBuffer osversioninfoex) { return osversioninfoex.getShort(osversioninfoex.position() + SERVICEPACKMAJOR); }
	public static int servicePackMinor(ByteBuffer osversioninfoex) { return osversioninfoex.getShort(osversioninfoex.position() + SERVICEPACKMINOR); }
	public static int suiteMask(ByteBuffer osversioninfoex) { return osversioninfoex.getShort(osversioninfoex.position() + SUITEMASK); }
	public static int productType(ByteBuffer osversioninfoex) { return osversioninfoex.get(osversioninfoex.position() + PRODUCTTYPE); }

}