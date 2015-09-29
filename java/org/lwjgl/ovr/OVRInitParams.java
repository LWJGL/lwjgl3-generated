/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Parameters for {@link OVR#ovr_Initialize}. */
public final class OVRInitParams extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		REQUESTEDMINORVERSION,
		LOGCALLBACK,
		USERDATA,
		CONNECTIONTIMEOUTMS;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		FLAGS = offsets.get(0);
		REQUESTEDMINORVERSION = offsets.get(1);
		LOGCALLBACK = offsets.get(2);
		USERDATA = offsets.get(3);
		CONNECTIONTIMEOUTMS = offsets.get(4);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRInitParams(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRInitParams} instance at the specified memory address. */
	public OVRInitParams(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRInitParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRInitParams(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getFlags() { return ngetFlags(address()); }
	public int getRequestedMinorVersion() { return ngetRequestedMinorVersion(address()); }
	public long getLogCallback() { return ngetLogCallback(address()); }
	public long getUserData() { return ngetUserData(address()); }
	public int getConnectionTimeoutMS() { return ngetConnectionTimeoutMS(address()); }

	public OVRInitParams setFlags(int Flags) { nsetFlags(address(), Flags); return this; }
	public OVRInitParams setRequestedMinorVersion(int RequestedMinorVersion) { nsetRequestedMinorVersion(address(), RequestedMinorVersion); return this; }
	public OVRInitParams setLogCallback(long LogCallback) { nsetLogCallback(address(), LogCallback); return this; }
	public OVRInitParams setUserData(long UserData) { nsetUserData(address(), UserData); return this; }
	public OVRInitParams setConnectionTimeoutMS(int ConnectionTimeoutMS) { nsetConnectionTimeoutMS(address(), ConnectionTimeoutMS); return this; }

	/** Initializes this struct with the specified values. */
	public OVRInitParams set(
		int Flags,
		int RequestedMinorVersion,
		long LogCallback,
		long UserData,
		int ConnectionTimeoutMS
	) {
		setFlags(Flags);
		setRequestedMinorVersion(RequestedMinorVersion);
		setLogCallback(LogCallback);
		setUserData(UserData);
		setConnectionTimeoutMS(ConnectionTimeoutMS);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRInitParams nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public OVRInitParams set(OVRInitParams src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRInitParams set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRInitParams} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRInitParams malloc() {
		return new OVRInitParams(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRInitParams} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRInitParams calloc() {
		return new OVRInitParams(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRInitParams} instance allocated with {@link BufferUtils}. */
	public static OVRInitParams create() {
		return new OVRInitParams(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInitParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInitParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInitParams.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetFlags(long struct) { return memGetInt(struct + FLAGS); }
	public static int getFlags(ByteBuffer struct) { return ngetFlags(memAddress(struct)); }
	public static int ngetRequestedMinorVersion(long struct) { return memGetInt(struct + REQUESTEDMINORVERSION); }
	public static int getRequestedMinorVersion(ByteBuffer struct) { return ngetRequestedMinorVersion(memAddress(struct)); }
	public static long ngetLogCallback(long struct) { return memGetAddress(struct + LOGCALLBACK); }
	public static long getLogCallback(ByteBuffer struct) { return ngetLogCallback(memAddress(struct)); }
	public static long ngetUserData(long struct) { return memGetAddress(struct + USERDATA); }
	public static long getUserData(ByteBuffer struct) { return ngetUserData(memAddress(struct)); }
	public static int ngetConnectionTimeoutMS(long struct) { return memGetInt(struct + CONNECTIONTIMEOUTMS); }
	public static int getConnectionTimeoutMS(ByteBuffer struct) { return ngetConnectionTimeoutMS(memAddress(struct)); }

	public static void nsetFlags(long struct, int Flags) { memPutInt(struct + FLAGS, Flags); }
	public static void setFlags(ByteBuffer struct, int Flags) { nsetFlags(memAddress(struct), Flags); }
	public static void nsetRequestedMinorVersion(long struct, int RequestedMinorVersion) { memPutInt(struct + REQUESTEDMINORVERSION, RequestedMinorVersion); }
	public static void setRequestedMinorVersion(ByteBuffer struct, int RequestedMinorVersion) { nsetRequestedMinorVersion(memAddress(struct), RequestedMinorVersion); }
	public static void nsetLogCallback(long struct, long LogCallback) { memPutAddress(struct + LOGCALLBACK, LogCallback); }
	public static void setLogCallback(ByteBuffer struct, long LogCallback) { nsetLogCallback(memAddress(struct), LogCallback); }
	public static void nsetUserData(long struct, long UserData) { memPutAddress(struct + USERDATA, UserData); }
	public static void setUserData(ByteBuffer struct, long UserData) { nsetUserData(memAddress(struct), UserData); }
	public static void nsetConnectionTimeoutMS(long struct, int ConnectionTimeoutMS) { memPutInt(struct + CONNECTIONTIMEOUTMS, ConnectionTimeoutMS); }
	public static void setConnectionTimeoutMS(ByteBuffer struct, int ConnectionTimeoutMS) { nsetConnectionTimeoutMS(memAddress(struct), ConnectionTimeoutMS); }

	// -----------------------------------

	/** An array of {@link OVRInitParams} structs. */
	public static final class Buffer extends StructBuffer<OVRInitParams, Buffer> {

		/**
		 * Creates a new {@link OVRInitParams.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRInitParams#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRInitParams newInstance(long address) {
			return new OVRInitParams(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public int getFlags() { return ngetFlags(address()); }
		public int getRequestedMinorVersion() { return ngetRequestedMinorVersion(address()); }
		public long getLogCallback() { return ngetLogCallback(address()); }
		public long getUserData() { return ngetUserData(address()); }
		public int getConnectionTimeoutMS() { return ngetConnectionTimeoutMS(address()); }

		public OVRInitParams.Buffer setFlags(int Flags) { nsetFlags(address(), Flags); return this; }
		public OVRInitParams.Buffer setRequestedMinorVersion(int RequestedMinorVersion) { nsetRequestedMinorVersion(address(), RequestedMinorVersion); return this; }
		public OVRInitParams.Buffer setLogCallback(long LogCallback) { nsetLogCallback(address(), LogCallback); return this; }
		public OVRInitParams.Buffer setUserData(long UserData) { nsetUserData(address(), UserData); return this; }
		public OVRInitParams.Buffer setConnectionTimeoutMS(int ConnectionTimeoutMS) { nsetConnectionTimeoutMS(address(), ConnectionTimeoutMS); return this; }

	}

}