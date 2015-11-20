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

/**
 * Parameters for {@link OVR#ovr_Initialize}.
 * 
 * <h3>ovrInitParams members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Flags</td><td class="nw">uint32_t</td><td>combination of ovrInitFlags or 0</td></tr>
 * <tr><td>RequestedMinorVersion</td><td class="nw">uint32_t</td><td>request a specific minimum minor version of the LibOVR runtime. Flags must include ovrInit_RequestVersion or this will be ignored.</td></tr>
 * <tr><td>LogCallback</td><td class="nw">ovrLogCallback</td><td>log callback function, which may be called at any time asynchronously from multiple threads until {@link OVR#ovr_Shutdown} completes. Pass {@code NULL} for no log
 * callback.</td></tr>
 * <tr><td>UserData</td><td class="nw">uintptr_t</td><td>user-supplied data which is passed as-is to LogCallback. Typically this is used to store an application-specific pointer which is read in the callback
 * function.</td></tr>
 * <tr><td>ConnectionTimeoutMS</td><td class="nw">uint32_t</td><td>number of milliseconds to wait for a connection to the server. Pass 0 for the default timeout</td></tr>
 * <tr><td>*</td><td class="nw">char[4]</td><td></td></tr>
 * </table>
 */
public class OVRInitParams extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		REQUESTEDMINORVERSION,
		LOGCALLBACK,
		USERDATA,
		CONNECTIONTIMEOUTMS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(Pointer.POINTER_SIZE),
			__member(Pointer.POINTER_SIZE),
			__member(4),
			__padding(4, true)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		FLAGS = layout.offsetof(0);
		REQUESTEDMINORVERSION = layout.offsetof(1);
		LOGCALLBACK = layout.offsetof(2);
		USERDATA = layout.offsetof(3);
		CONNECTIONTIMEOUTMS = layout.offsetof(4);
	}

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

	/** Returns the value of the {@code Flags} field. */
	public int Flags() { return nFlags(address()); }
	/** Returns the value of the {@code RequestedMinorVersion} field. */
	public int RequestedMinorVersion() { return nRequestedMinorVersion(address()); }
	/** Returns the {@code OVRLogCallback} instance at the {@code LogCallback} field. */
	public OVRLogCallback LogCallback() { return nLogCallback(address()); }
	/** Returns the value of the {@code UserData} field. */
	public long UserData() { return nUserData(address()); }
	/** Returns the value of the {@code ConnectionTimeoutMS} field. */
	public int ConnectionTimeoutMS() { return nConnectionTimeoutMS(address()); }

	/** Sets the specified value to the {@code Flags} field. */
	public OVRInitParams Flags(int value) { nFlags(address(), value); return this; }
	/** Sets the specified value to the {@code RequestedMinorVersion} field. */
	public OVRInitParams RequestedMinorVersion(int value) { nRequestedMinorVersion(address(), value); return this; }
	/** Sets the specified value to the {@code LogCallback} field. */
	public OVRInitParams LogCallback(long value) { nLogCallback(address(), value); return this; }
	/** Sets the specified value to the {@code UserData} field. */
	public OVRInitParams UserData(long value) { nUserData(address(), value); return this; }
	/** Sets the specified value to the {@code ConnectionTimeoutMS} field. */
	public OVRInitParams ConnectionTimeoutMS(int value) { nConnectionTimeoutMS(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRInitParams set(
		int Flags,
		int RequestedMinorVersion,
		long LogCallback,
		long UserData,
		int ConnectionTimeoutMS
	) {
		Flags(Flags);
		RequestedMinorVersion(RequestedMinorVersion);
		LogCallback(LogCallback);
		UserData(UserData);
		ConnectionTimeoutMS(ConnectionTimeoutMS);

		return this;
	}

	/** Unsafe version of {@link #set(OVRInitParams) set}. */
	public OVRInitParams nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRInitParams set(OVRInitParams src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRInitParams) set}. */
	public OVRInitParams set(ByteBuffer struct) {
		if ( CHECKS )
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

	/**
	 * Create a {@link OVRInitParams.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Flags}. */
	public static int nFlags(long struct) { return memGetInt(struct + OVRInitParams.FLAGS); }
	/** Unsafe version of {@link #RequestedMinorVersion}. */
	public static int nRequestedMinorVersion(long struct) { return memGetInt(struct + OVRInitParams.REQUESTEDMINORVERSION); }
	/** Unsafe version of {@link #LogCallback}. */
	public static OVRLogCallback nLogCallback(long struct) { return org.lwjgl.system.libffi.Closure.create(memGetAddress(struct + OVRInitParams.LOGCALLBACK)); }
	/** Unsafe version of {@link #UserData}. */
	public static long nUserData(long struct) { return memGetAddress(struct + OVRInitParams.USERDATA); }
	/** Unsafe version of {@link #ConnectionTimeoutMS}. */
	public static int nConnectionTimeoutMS(long struct) { return memGetInt(struct + OVRInitParams.CONNECTIONTIMEOUTMS); }

	/** Unsafe version of {@link #Flags(int) Flags}. */
	public static void nFlags(long struct, int value) { memPutInt(struct + OVRInitParams.FLAGS, value); }
	/** Unsafe version of {@link #RequestedMinorVersion(int) RequestedMinorVersion}. */
	public static void nRequestedMinorVersion(long struct, int value) { memPutInt(struct + OVRInitParams.REQUESTEDMINORVERSION, value); }
	/** Unsafe version of {@link #LogCallback(long) LogCallback}. */
	public static void nLogCallback(long struct, long value) { memPutAddress(struct + OVRInitParams.LOGCALLBACK, value); }
	/** Unsafe version of {@link #UserData(long) UserData}. */
	public static void nUserData(long struct, long value) { memPutAddress(struct + OVRInitParams.USERDATA, value); }
	/** Unsafe version of {@link #ConnectionTimeoutMS(int) ConnectionTimeoutMS}. */
	public static void nConnectionTimeoutMS(long struct, int value) { memPutInt(struct + OVRInitParams.CONNECTIONTIMEOUTMS, value); }

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

		/** Returns the value of the {@code Flags} field. */
		public int Flags() { return nFlags(address()); }
		/** Returns the value of the {@code RequestedMinorVersion} field. */
		public int RequestedMinorVersion() { return nRequestedMinorVersion(address()); }
		/** Returns the {@code OVRLogCallback} instance at the {@code LogCallback} field. */
		public OVRLogCallback LogCallback() { return nLogCallback(address()); }
		/** Returns the value of the {@code UserData} field. */
		public long UserData() { return nUserData(address()); }
		/** Returns the value of the {@code ConnectionTimeoutMS} field. */
		public int ConnectionTimeoutMS() { return nConnectionTimeoutMS(address()); }

		/** Sets the specified value to the {@code Flags} field. */
		public OVRInitParams.Buffer Flags(int value) { nFlags(address(), value); return this; }
		/** Sets the specified value to the {@code RequestedMinorVersion} field. */
		public OVRInitParams.Buffer RequestedMinorVersion(int value) { nRequestedMinorVersion(address(), value); return this; }
		/** Sets the specified value to the {@code LogCallback} field. */
		public OVRInitParams.Buffer LogCallback(long value) { nLogCallback(address(), value); return this; }
		/** Sets the specified value to the {@code UserData} field. */
		public OVRInitParams.Buffer UserData(long value) { nUserData(address(), value); return this; }
		/** Sets the specified value to the {@code ConnectionTimeoutMS} field. */
		public OVRInitParams.Buffer ConnectionTimeoutMS(int value) { nConnectionTimeoutMS(address(), value); return this; }

	}

}