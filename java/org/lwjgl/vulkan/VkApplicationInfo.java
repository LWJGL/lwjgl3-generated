/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains information about the application.
 * 
 * <h3>Valid Usage</h3>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pApplicationName} is not {@code NULL}, {@code pApplicationName} <b>must</b> be a null-terminated string</li>
 * <li>If {@code pEngineName} is not {@code NULL}, {@code pEngineName} <b>must</b> be a null-terminated string</li>
 * <li>{@code apiVersion} <b>must</b> be zero, or otherwise it <b>must</b> be a version that the implementation supports, or supports an effective substitute for</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkApplicationInfo {
    VkStructureType sType;
    const void * pNext;
    const char * pApplicationName;
    uint32_t applicationVersion;
    const char * pEngineName;
    uint32_t engineVersion;
    uint32_t apiVersion;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>sType</td><td>should be set to {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO}</td></tr>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * <tr><td>pApplicationName</td><td>a pointer to a {@code NULL}-terminated UTF-8 string containing the name of the application</td></tr>
 * <tr><td>applicationVersion</td><td>contains an application-specific version number. It is recommended that new versions of an existing application specify monotonically increasing values
 * for {@code applicationVersion}.</td></tr>
 * <tr><td>pEngineName</td><td>if the application is built on a reusable engine, the name of the engine may be specified in the {@code NULL}-terminated UTF-8 string pointed to by
 * {@code pEngineName}</td></tr>
 * <tr><td>engineVersion</td><td>the version of the engine used to create the application</td></tr>
 * <tr><td>apiVersion</td><td>the version of the Vulkan API that the application expects to use</td></tr>
 * </table>
 */
public class VkApplicationInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		PAPPLICATIONNAME,
		APPLICATIONVERSION,
		PENGINENAME,
		ENGINEVERSION,
		APIVERSION;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		PAPPLICATIONNAME = layout.offsetof(2);
		APPLICATIONVERSION = layout.offsetof(3);
		PENGINENAME = layout.offsetof(4);
		ENGINEVERSION = layout.offsetof(5);
		APIVERSION = layout.offsetof(6);
	}

	VkApplicationInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkApplicationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkApplicationInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pApplicationName} field. */
	public ByteBuffer pApplicationName() { return npApplicationName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code pApplicationName} field. */
	public String pApplicationNameString() { return npApplicationNameString(address()); }
	/** Returns the value of the {@code applicationVersion} field. */
	public int applicationVersion() { return napplicationVersion(address()); }
	/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pEngineName} field. */
	public ByteBuffer pEngineName() { return npEngineName(address()); }
	/** Decodes the null-terminated string pointed to by the {@code pEngineName} field. */
	public String pEngineNameString() { return npEngineNameString(address()); }
	/** Returns the value of the {@code engineVersion} field. */
	public int engineVersion() { return nengineVersion(address()); }
	/** Returns the value of the {@code apiVersion} field. */
	public int apiVersion() { return napiVersion(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkApplicationInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkApplicationInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code pApplicationName} field. */
	public VkApplicationInfo pApplicationName(ByteBuffer value) { npApplicationName(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code pApplicationName} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #pApplicationNameFree}.</p>
	 */
	public VkApplicationInfo pApplicationName(CharSequence value) { npApplicationName(address(), value); return this; }
	/** Frees the string encoded by {@link #pApplicationName(CharSequence)} and stored in the {@code pApplicationName} field. */
	public VkApplicationInfo pApplicationNameFree() { npApplicationNameFree(address()); return this; }
	/** Sets the specified value to the {@code applicationVersion} field. */
	public VkApplicationInfo applicationVersion(int value) { napplicationVersion(address(), value); return this; }
	/** Sets the address of the specified encoded string to the {@code pEngineName} field. */
	public VkApplicationInfo pEngineName(ByteBuffer value) { npEngineName(address(), value); return this; }
	/**
	 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code pEngineName} field.
	 *
	 * <p>The encoded string must be explicitly freed with {@link #pEngineNameFree}.</p>
	 */
	public VkApplicationInfo pEngineName(CharSequence value) { npEngineName(address(), value); return this; }
	/** Frees the string encoded by {@link #pEngineName(CharSequence)} and stored in the {@code pEngineName} field. */
	public VkApplicationInfo pEngineNameFree() { npEngineNameFree(address()); return this; }
	/** Sets the specified value to the {@code engineVersion} field. */
	public VkApplicationInfo engineVersion(int value) { nengineVersion(address(), value); return this; }
	/** Sets the specified value to the {@code apiVersion} field. */
	public VkApplicationInfo apiVersion(int value) { napiVersion(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkApplicationInfo set(
		int sType,
		long pNext,
		ByteBuffer pApplicationName,
		int applicationVersion,
		ByteBuffer pEngineName,
		int engineVersion,
		int apiVersion
	) {
		sType(sType);
		pNext(pNext);
		pApplicationName(pApplicationName);
		applicationVersion(applicationVersion);
		pEngineName(pEngineName);
		engineVersion(engineVersion);
		apiVersion(apiVersion);

		return this;
	}

	/** Unsafe version of {@link #set(VkApplicationInfo) set}. */
	public VkApplicationInfo nset(long struct) {
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
	public VkApplicationInfo set(VkApplicationInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkApplicationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkApplicationInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkApplicationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkApplicationInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkApplicationInfo} instance allocated with {@link BufferUtils}. */
	public static VkApplicationInfo create() {
		return new VkApplicationInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkApplicationInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkApplicationInfo create(long address) {
		return address == NULL ? null : new VkApplicationInfo(address, null);
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkApplicationInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkApplicationInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkApplicationInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkApplicationInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkApplicationInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkApplicationInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkApplicationInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkApplicationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkApplicationInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkApplicationInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkApplicationInfo.PNEXT); }
	/** Unsafe version of {@link #pApplicationName}. */
	public static ByteBuffer npApplicationName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
	/** Unsafe version of {@link #pApplicationNameString}. */
	public static String npApplicationNameString(long struct) { return memUTF8(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
	/** Unsafe version of {@link #applicationVersion}. */
	public static int napplicationVersion(long struct) { return memGetInt(struct + VkApplicationInfo.APPLICATIONVERSION); }
	/** Unsafe version of {@link #pEngineName}. */
	public static ByteBuffer npEngineName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
	/** Unsafe version of {@link #pEngineNameString}. */
	public static String npEngineNameString(long struct) { return memUTF8(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
	/** Unsafe version of {@link #engineVersion}. */
	public static int nengineVersion(long struct) { return memGetInt(struct + VkApplicationInfo.ENGINEVERSION); }
	/** Unsafe version of {@link #apiVersion}. */
	public static int napiVersion(long struct) { return memGetInt(struct + VkApplicationInfo.APIVERSION); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkApplicationInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkApplicationInfo.PNEXT, value); }
	/** Unsafe version of {@link #pApplicationName(ByteBuffer) pApplicationName}. */
	public static void npApplicationName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + VkApplicationInfo.PAPPLICATIONNAME, memAddressSafe(value));
	}
	/** Unsafe version of {@link #pApplicationName(CharSequence) pApplicationName}. */
	public static void npApplicationName(long struct, CharSequence value) { npApplicationName(struct, memUTF8(value)); }
	/** Unsafe version of {@link #pApplicationNameFree}. */
	public static void npApplicationNameFree(long struct) { nmemFree(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
	/** Unsafe version of {@link #applicationVersion(int) applicationVersion}. */
	public static void napplicationVersion(long struct, int value) { memPutInt(struct + VkApplicationInfo.APPLICATIONVERSION, value); }
	/** Unsafe version of {@link #pEngineName(ByteBuffer) pEngineName}. */
	public static void npEngineName(long struct, ByteBuffer value) { 
		if ( CHECKS && value != null ) checkNT1(value); 
		memPutAddress(struct + VkApplicationInfo.PENGINENAME, memAddressSafe(value));
	}
	/** Unsafe version of {@link #pEngineName(CharSequence) pEngineName}. */
	public static void npEngineName(long struct, CharSequence value) { npEngineName(struct, memUTF8(value)); }
	/** Unsafe version of {@link #pEngineNameFree}. */
	public static void npEngineNameFree(long struct) { nmemFree(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
	/** Unsafe version of {@link #engineVersion(int) engineVersion}. */
	public static void nengineVersion(long struct, int value) { memPutInt(struct + VkApplicationInfo.ENGINEVERSION, value); }
	/** Unsafe version of {@link #apiVersion(int) apiVersion}. */
	public static void napiVersion(long struct, int value) { memPutInt(struct + VkApplicationInfo.APIVERSION, value); }

	// -----------------------------------

	/** An array of {@link VkApplicationInfo} structs. */
	public static final class Buffer extends StructBuffer<VkApplicationInfo, Buffer> {

		/**
		 * Creates a new {@link VkApplicationInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkApplicationInfo#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected VkApplicationInfo newInstance(long address) {
			return new VkApplicationInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkApplicationInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkApplicationInfo.npNext(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pApplicationName} field. */
		public ByteBuffer pApplicationName() { return VkApplicationInfo.npApplicationName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code pApplicationName} field. */
		public String pApplicationNameString() { return VkApplicationInfo.npApplicationNameString(address()); }
		/** Returns the value of the {@code applicationVersion} field. */
		public int applicationVersion() { return VkApplicationInfo.napplicationVersion(address()); }
		/** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pEngineName} field. */
		public ByteBuffer pEngineName() { return VkApplicationInfo.npEngineName(address()); }
		/** Decodes the null-terminated string pointed to by the {@code pEngineName} field. */
		public String pEngineNameString() { return VkApplicationInfo.npEngineNameString(address()); }
		/** Returns the value of the {@code engineVersion} field. */
		public int engineVersion() { return VkApplicationInfo.nengineVersion(address()); }
		/** Returns the value of the {@code apiVersion} field. */
		public int apiVersion() { return VkApplicationInfo.napiVersion(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkApplicationInfo.Buffer sType(int value) { VkApplicationInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkApplicationInfo.Buffer pNext(long value) { VkApplicationInfo.npNext(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code pApplicationName} field. */
		public VkApplicationInfo.Buffer pApplicationName(ByteBuffer value) { VkApplicationInfo.npApplicationName(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code pApplicationName} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #pApplicationNameFree}.</p>
		 */
		public VkApplicationInfo.Buffer pApplicationName(CharSequence value) { VkApplicationInfo.npApplicationName(address(), value); return this; }
		/** Frees the string encoded by {@link #pApplicationName(CharSequence)} and stored in the {@code pApplicationName} field. */
		public VkApplicationInfo.Buffer pApplicationNameFree() { VkApplicationInfo.npApplicationNameFree(address()); return this; }
		/** Sets the specified value to the {@code applicationVersion} field. */
		public VkApplicationInfo.Buffer applicationVersion(int value) { VkApplicationInfo.napplicationVersion(address(), value); return this; }
		/** Sets the address of the specified encoded string to the {@code pEngineName} field. */
		public VkApplicationInfo.Buffer pEngineName(ByteBuffer value) { VkApplicationInfo.npEngineName(address(), value); return this; }
		/**
		 * Encodes the specified {@link CharSequence} and sets the address of the encoded string to the {@code pEngineName} field.
		 *
		 * <p>The encoded string must be explicitly freed with {@link #pEngineNameFree}.</p>
		 */
		public VkApplicationInfo.Buffer pEngineName(CharSequence value) { VkApplicationInfo.npEngineName(address(), value); return this; }
		/** Frees the string encoded by {@link #pEngineName(CharSequence)} and stored in the {@code pEngineName} field. */
		public VkApplicationInfo.Buffer pEngineNameFree() { VkApplicationInfo.npEngineNameFree(address()); return this; }
		/** Sets the specified value to the {@code engineVersion} field. */
		public VkApplicationInfo.Buffer engineVersion(int value) { VkApplicationInfo.nengineVersion(address(), value); return this; }
		/** Sets the specified value to the {@code apiVersion} field. */
		public VkApplicationInfo.Buffer apiVersion(int value) { VkApplicationInfo.napiVersion(address(), value); return this; }

	}

}