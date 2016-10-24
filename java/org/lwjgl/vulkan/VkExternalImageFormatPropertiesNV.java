/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying external image format properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code imageFormatProperties} <b>must</b> be a valid {@link VkImageFormatProperties} structure</li>
 * <li>{@code externalMemoryFeatures} <b>must</b> be a valid combination of {@code VkExternalMemoryFeatureFlagBitsNV} values</li>
 * <li>{@code externalMemoryFeatures} <b>must</b> not be 0</li>
 * <li>{@code exportFromImportedHandleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * <li>{@code exportFromImportedHandleTypes} <b>must</b> not be 0</li>
 * <li>{@code compatibleHandleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * <li>{@code compatibleHandleTypes} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageFormatProperties}, {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code imageFormatProperties} &ndash; will be filled in as when calling {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, but the values returned <b>may</b> vary depending on the external handle type requested.</li>
 * <li>{@code externalMemoryFeatures} &ndash; a bitmask of {@code VkExternalMemoryFeatureFlagBitsNV} indicating properties of the external memory handle type ({@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType}) being queried, or 0 if the external memory handle type is 0.</li>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be used to create memory from which the handles of the type specified in {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType} <b>can</b> be exported, or 0 if the external memory handle type is 0.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a bit set for every external handle type that <b>may</b> be specified simultaneously with the handle type specified by {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType} when calling {@link VK10#vkAllocateMemory AllocateMemory}, or 0 if the external memory handle type is 0. {@code compatibleHandleTypes} will always contain {@link NVExternalMemoryCapabilities#vkGetPhysicalDeviceExternalImageFormatPropertiesNV GetPhysicalDeviceExternalImageFormatPropertiesNV}{@code ::externalHandleType}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExternalImageFormatPropertiesNV {
    {@link VkImageFormatProperties VkImageFormatProperties} imageFormatProperties;
    VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
    VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
    VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
}</code></pre>
 */
public class VkExternalImageFormatPropertiesNV extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		IMAGEFORMATPROPERTIES,
		EXTERNALMEMORYFEATURES,
		EXPORTFROMIMPORTEDHANDLETYPES,
		COMPATIBLEHANDLETYPES;

	static {
		Layout layout = __struct(
			__member(VkImageFormatProperties.SIZEOF, VkImageFormatProperties.ALIGNOF),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		IMAGEFORMATPROPERTIES = layout.offsetof(0);
		EXTERNALMEMORYFEATURES = layout.offsetof(1);
		EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(2);
		COMPATIBLEHANDLETYPES = layout.offsetof(3);
	}

	VkExternalImageFormatPropertiesNV(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExternalImageFormatPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExternalImageFormatPropertiesNV(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkImageFormatProperties} view of the {@code imageFormatProperties} field. */
	public VkImageFormatProperties imageFormatProperties() { return nimageFormatProperties(address()); }
	/** Returns the value of the {@code externalMemoryFeatures} field. */
	public int externalMemoryFeatures() { return nexternalMemoryFeatures(address()); }
	/** Returns the value of the {@code exportFromImportedHandleTypes} field. */
	public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
	/** Returns the value of the {@code compatibleHandleTypes} field. */
	public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }

	/** Copies the specified {@link VkImageFormatProperties} to the {@code imageFormatProperties} field. */
	public VkExternalImageFormatPropertiesNV imageFormatProperties(VkImageFormatProperties value) { nimageFormatProperties(address(), value); return this; }
	/** Sets the specified value to the {@code externalMemoryFeatures} field. */
	public VkExternalImageFormatPropertiesNV externalMemoryFeatures(int value) { nexternalMemoryFeatures(address(), value); return this; }
	/** Sets the specified value to the {@code exportFromImportedHandleTypes} field. */
	public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypes(int value) { nexportFromImportedHandleTypes(address(), value); return this; }
	/** Sets the specified value to the {@code compatibleHandleTypes} field. */
	public VkExternalImageFormatPropertiesNV compatibleHandleTypes(int value) { ncompatibleHandleTypes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkExternalImageFormatPropertiesNV set(
		VkImageFormatProperties imageFormatProperties,
		int externalMemoryFeatures,
		int exportFromImportedHandleTypes,
		int compatibleHandleTypes
	) {
		imageFormatProperties(imageFormatProperties);
		externalMemoryFeatures(externalMemoryFeatures);
		exportFromImportedHandleTypes(exportFromImportedHandleTypes);
		compatibleHandleTypes(compatibleHandleTypes);

		return this;
	}

	/** Unsafe version of {@link #set(VkExternalImageFormatPropertiesNV) set}. */
	public VkExternalImageFormatPropertiesNV nset(long struct) {
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
	public VkExternalImageFormatPropertiesNV set(VkExternalImageFormatPropertiesNV src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkExternalImageFormatPropertiesNV malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkExternalImageFormatPropertiesNV calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated with {@link BufferUtils}. */
	public static VkExternalImageFormatPropertiesNV create() {
		return new VkExternalImageFormatPropertiesNV(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkExternalImageFormatPropertiesNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExternalImageFormatPropertiesNV create(long address) {
		return address == NULL ? null : new VkExternalImageFormatPropertiesNV(address, null);
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkExternalImageFormatPropertiesNV.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkExternalImageFormatPropertiesNV mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkExternalImageFormatPropertiesNV callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExternalImageFormatPropertiesNV mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExternalImageFormatPropertiesNV callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #imageFormatProperties}. */
	public static VkImageFormatProperties nimageFormatProperties(long struct) { return VkImageFormatProperties.create(struct + VkExternalImageFormatPropertiesNV.IMAGEFORMATPROPERTIES); }
	/** Unsafe version of {@link #externalMemoryFeatures}. */
	public static int nexternalMemoryFeatures(long struct) { return memGetInt(struct + VkExternalImageFormatPropertiesNV.EXTERNALMEMORYFEATURES); }
	/** Unsafe version of {@link #exportFromImportedHandleTypes}. */
	public static int nexportFromImportedHandleTypes(long struct) { return memGetInt(struct + VkExternalImageFormatPropertiesNV.EXPORTFROMIMPORTEDHANDLETYPES); }
	/** Unsafe version of {@link #compatibleHandleTypes}. */
	public static int ncompatibleHandleTypes(long struct) { return memGetInt(struct + VkExternalImageFormatPropertiesNV.COMPATIBLEHANDLETYPES); }

	/** Unsafe version of {@link #imageFormatProperties(VkImageFormatProperties) imageFormatProperties}. */
	public static void nimageFormatProperties(long struct, VkImageFormatProperties value) { memCopy(value.address(), struct + VkExternalImageFormatPropertiesNV.IMAGEFORMATPROPERTIES, VkImageFormatProperties.SIZEOF); }
	/** Unsafe version of {@link #externalMemoryFeatures(int) externalMemoryFeatures}. */
	public static void nexternalMemoryFeatures(long struct, int value) { memPutInt(struct + VkExternalImageFormatPropertiesNV.EXTERNALMEMORYFEATURES, value); }
	/** Unsafe version of {@link #exportFromImportedHandleTypes(int) exportFromImportedHandleTypes}. */
	public static void nexportFromImportedHandleTypes(long struct, int value) { memPutInt(struct + VkExternalImageFormatPropertiesNV.EXPORTFROMIMPORTEDHANDLETYPES, value); }
	/** Unsafe version of {@link #compatibleHandleTypes(int) compatibleHandleTypes}. */
	public static void ncompatibleHandleTypes(long struct, int value) { memPutInt(struct + VkExternalImageFormatPropertiesNV.COMPATIBLEHANDLETYPES, value); }

	// -----------------------------------

	/** An array of {@link VkExternalImageFormatPropertiesNV} structs. */
	public static class Buffer extends StructBuffer<VkExternalImageFormatPropertiesNV, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkExternalImageFormatPropertiesNV.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExternalImageFormatPropertiesNV#SIZEOF}, and its mark will be undefined.
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
		protected VkExternalImageFormatPropertiesNV newInstance(long address) {
			return new VkExternalImageFormatPropertiesNV(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkImageFormatProperties} view of the {@code imageFormatProperties} field. */
		public VkImageFormatProperties imageFormatProperties() { return VkExternalImageFormatPropertiesNV.nimageFormatProperties(address()); }
		/** Returns the value of the {@code externalMemoryFeatures} field. */
		public int externalMemoryFeatures() { return VkExternalImageFormatPropertiesNV.nexternalMemoryFeatures(address()); }
		/** Returns the value of the {@code exportFromImportedHandleTypes} field. */
		public int exportFromImportedHandleTypes() { return VkExternalImageFormatPropertiesNV.nexportFromImportedHandleTypes(address()); }
		/** Returns the value of the {@code compatibleHandleTypes} field. */
		public int compatibleHandleTypes() { return VkExternalImageFormatPropertiesNV.ncompatibleHandleTypes(address()); }

		/** Copies the specified {@link VkImageFormatProperties} to the {@code imageFormatProperties} field. */
		public VkExternalImageFormatPropertiesNV.Buffer imageFormatProperties(VkImageFormatProperties value) { VkExternalImageFormatPropertiesNV.nimageFormatProperties(address(), value); return this; }
		/** Sets the specified value to the {@code externalMemoryFeatures} field. */
		public VkExternalImageFormatPropertiesNV.Buffer externalMemoryFeatures(int value) { VkExternalImageFormatPropertiesNV.nexternalMemoryFeatures(address(), value); return this; }
		/** Sets the specified value to the {@code exportFromImportedHandleTypes} field. */
		public VkExternalImageFormatPropertiesNV.Buffer exportFromImportedHandleTypes(int value) { VkExternalImageFormatPropertiesNV.nexportFromImportedHandleTypes(address(), value); return this; }
		/** Sets the specified value to the {@code compatibleHandleTypes} field. */
		public VkExternalImageFormatPropertiesNV.Buffer compatibleHandleTypes(int value) { VkExternalImageFormatPropertiesNV.ncompatibleHandleTypes(address(), value); return this; }

	}

}