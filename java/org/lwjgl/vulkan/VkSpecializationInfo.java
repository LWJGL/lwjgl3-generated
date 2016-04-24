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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSpecializationInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSpecializationInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about specialization constants.</p>
 * 
 * <p>Specialization constants are a mechanism whereby constants in a SPIR-V module can have their constant value specified at the time the
 * {@code VkPipeline} is created. This allows a SPIR-V module to have constants that can be modified while executing an application that uses the Vulkan
 * API.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code mapEntryCount} is not 0, {@code pMapEntries} <b>must</b> be a pointer to an array of {@code mapEntryCount} {@link VkSpecializationMapEntry}
 * structures</li>
 * <li>If {@code dataSize} is not 0, {@code pData} <b>must</b> be a pointer to an array of {@code dataSize} bytes</li>
 * <li>The {@code offset} member of any given element of {@code pMapEntries} <b>must</b> be less than {@code dataSize}</li>
 * <li>For any given element of {@code pMapEntries}, {@code size} <b>must</b> be less than or equal to {@code dataSize} minus {@code offset}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mapEntryCount} &ndash; the number of entries in the {@code pMapEntries} array</li>
 * <li>{@code pMapEntries} &ndash; a pointer to an array of {@link VkSpecializationMapEntry} which maps constant IDs to offsets in {@code pData}</li>
 * <li>{@code dataSize} &ndash; the byte size of the {@code pData} buffer</li>
 * <li>{@code pData} &ndash; contains the actual constant values to specialize with</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSpecializationInfo {
    uint32_t mapEntryCount;
    const VkSpecializationMapEntry * pMapEntries;
    size_t dataSize;
    const void * pData;
}</code></pre>
 */
public class VkSpecializationInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MAPENTRYCOUNT,
		PMAPENTRIES,
		DATASIZE,
		PDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MAPENTRYCOUNT = layout.offsetof(0);
		PMAPENTRIES = layout.offsetof(1);
		DATASIZE = layout.offsetof(2);
		PDATA = layout.offsetof(3);
	}

	VkSpecializationInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSpecializationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSpecializationInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code mapEntryCount} field. */
	public int mapEntryCount() { return nmapEntryCount(address()); }
	/** Returns a {@link VkSpecializationMapEntry.Buffer} view of the struct array pointed to by the {@code pMapEntries} field. */
	public VkSpecializationMapEntry.Buffer pMapEntries() { return npMapEntries(address()); }
	/** Returns the value of the {@code dataSize} field. */
	public long dataSize() { return ndataSize(address()); }
	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
	public ByteBuffer pData() { return npData(address()); }

	/** Sets the address of the specified {@link VkSpecializationMapEntry.Buffer} to the {@code pMapEntries} field. */
	public VkSpecializationInfo pMapEntries(VkSpecializationMapEntry.Buffer value) { npMapEntries(address(), value); return this; }
	/** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
	public VkSpecializationInfo pData(ByteBuffer value) { npData(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSpecializationInfo set(
		VkSpecializationMapEntry.Buffer pMapEntries,
		ByteBuffer pData
	) {
		pMapEntries(pMapEntries);
		pData(pData);

		return this;
	}

	/** Unsafe version of {@link #set(VkSpecializationInfo) set}. */
	public VkSpecializationInfo nset(long struct) {
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
	public VkSpecializationInfo set(VkSpecializationInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSpecializationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSpecializationInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSpecializationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSpecializationInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSpecializationInfo} instance allocated with {@link BufferUtils}. */
	public static VkSpecializationInfo create() {
		return new VkSpecializationInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSpecializationInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSpecializationInfo create(long address) {
		return address == NULL ? null : new VkSpecializationInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSpecializationInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSpecializationInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSpecializationInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSpecializationInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSpecializationInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSpecializationInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSpecializationInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSpecializationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSpecializationInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSpecializationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mapEntryCount}. */
	public static int nmapEntryCount(long struct) { return memGetInt(struct + VkSpecializationInfo.MAPENTRYCOUNT); }
	/** Unsafe version of {@link #pMapEntries}. */
	public static VkSpecializationMapEntry.Buffer npMapEntries(long struct) { return VkSpecializationMapEntry.create(memGetAddress(struct + VkSpecializationInfo.PMAPENTRIES), nmapEntryCount(struct)); }
	/** Unsafe version of {@link #dataSize}. */
	public static long ndataSize(long struct) { return memGetAddress(struct + VkSpecializationInfo.DATASIZE); }
	/** Unsafe version of {@link #pData() pData}. */
	public static ByteBuffer npData(long struct) { return memByteBuffer(memGetAddress(struct + VkSpecializationInfo.PDATA), (int)ndataSize(struct)); }

	/** Sets the specified value to the {@code mapEntryCount} field of the specified {@code struct}. */
	public static void nmapEntryCount(long struct, int value) { memPutInt(struct + VkSpecializationInfo.MAPENTRYCOUNT, value); }
	/** Unsafe version of {@link #pMapEntries(VkSpecializationMapEntry.Buffer) pMapEntries}. */
	public static void npMapEntries(long struct, VkSpecializationMapEntry.Buffer value) { memPutAddress(struct + VkSpecializationInfo.PMAPENTRIES, addressSafe(value)); nmapEntryCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code dataSize} field of the specified {@code struct}. */
	public static void ndataSize(long struct, long value) { memPutAddress(struct + VkSpecializationInfo.DATASIZE, value); }
	/** Unsafe version of {@link #pData(ByteBuffer) pData}. */
	public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + VkSpecializationInfo.PDATA, memAddressSafe(value)); ndataSize(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nmapEntryCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkSpecializationInfo.PMAPENTRIES));
		if ( ndataSize(struct) != 0 )
			checkPointer(memGetAddress(struct + VkSpecializationInfo.PDATA));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link VkSpecializationInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSpecializationInfo, Buffer> {

		/**
		 * Creates a new {@link VkSpecializationInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSpecializationInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSpecializationInfo newInstance(long address) {
			return new VkSpecializationInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code mapEntryCount} field. */
		public int mapEntryCount() { return VkSpecializationInfo.nmapEntryCount(address()); }
		/** Returns a {@link VkSpecializationMapEntry.Buffer} view of the struct array pointed to by the {@code pMapEntries} field. */
		public VkSpecializationMapEntry.Buffer pMapEntries() { return VkSpecializationInfo.npMapEntries(address()); }
		/** Returns the value of the {@code dataSize} field. */
		public long dataSize() { return VkSpecializationInfo.ndataSize(address()); }
		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pData} field. */
		public ByteBuffer pData() { return VkSpecializationInfo.npData(address()); }

		/** Sets the address of the specified {@link VkSpecializationMapEntry.Buffer} to the {@code pMapEntries} field. */
		public VkSpecializationInfo.Buffer pMapEntries(VkSpecializationMapEntry.Buffer value) { VkSpecializationInfo.npMapEntries(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code pData} field. */
		public VkSpecializationInfo.Buffer pData(ByteBuffer value) { VkSpecializationInfo.npData(address(), value); return this; }

	}

}