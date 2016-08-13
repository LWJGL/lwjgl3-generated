/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPhysicalDeviceSparseProperties.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPhysicalDeviceSparseProperties">Vulkan Specification</a>
 * 
 * <p>Some features of the implementation are not possible to disable, and are reported to allow applications to alter their sparse resource usage
 * accordingly.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code residencyStandard2DBlockShape} &ndash; {@link VK10#VK_TRUE TRUE} if the physical device will access all single-sample 2D sparse resources using the standard sparse image block shapes</li>
 * <li>{@code residencyStandard2DMultisampleBlockShape} &ndash; {@link VK10#VK_TRUE TRUE} if the physical device will access all multisample 2D sparse resources using the standard sparse image block shapes</li>
 * <li>{@code residencyStandard3DBlockShape} &ndash; {@link VK10#VK_TRUE TRUE} if the physical device will access all 3D sparse resources using the standard sparse image block shapes</li>
 * <li>{@code residencyAlignedMipSize} &ndash; 
 * TRUE if images with mip level dimensions that are not integer multiples of the corresponding dimensions of the sparse image block may be placed in the
 * mip tail</li>
 * <li>{@code residencyNonResidentStrict} &ndash; whether the physical device <b>can</b> consistently access non-resident regions of a resource</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceSparseProperties {
    VkBool32 residencyStandard2DBlockShape;
    VkBool32 residencyStandard2DMultisampleBlockShape;
    VkBool32 residencyStandard3DBlockShape;
    VkBool32 residencyAlignedMipSize;
    VkBool32 residencyNonResidentStrict;
}</code></pre>
 */
public class VkPhysicalDeviceSparseProperties extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		RESIDENCYSTANDARD2DBLOCKSHAPE,
		RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE,
		RESIDENCYSTANDARD3DBLOCKSHAPE,
		RESIDENCYALIGNEDMIPSIZE,
		RESIDENCYNONRESIDENTSTRICT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		RESIDENCYSTANDARD2DBLOCKSHAPE = layout.offsetof(0);
		RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE = layout.offsetof(1);
		RESIDENCYSTANDARD3DBLOCKSHAPE = layout.offsetof(2);
		RESIDENCYALIGNEDMIPSIZE = layout.offsetof(3);
		RESIDENCYNONRESIDENTSTRICT = layout.offsetof(4);
	}

	VkPhysicalDeviceSparseProperties(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceSparseProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceSparseProperties(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code residencyStandard2DBlockShape} field. */
	public boolean residencyStandard2DBlockShape() { return nresidencyStandard2DBlockShape(address()) != 0; }
	/** Returns the value of the {@code residencyStandard2DMultisampleBlockShape} field. */
	public boolean residencyStandard2DMultisampleBlockShape() { return nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
	/** Returns the value of the {@code residencyStandard3DBlockShape} field. */
	public boolean residencyStandard3DBlockShape() { return nresidencyStandard3DBlockShape(address()) != 0; }
	/** Returns the value of the {@code residencyAlignedMipSize} field. */
	public boolean residencyAlignedMipSize() { return nresidencyAlignedMipSize(address()) != 0; }
	/** Returns the value of the {@code residencyNonResidentStrict} field. */
	public boolean residencyNonResidentStrict() { return nresidencyNonResidentStrict(address()) != 0; }

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceSparseProperties} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceSparseProperties create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceSparseProperties(address, null);
	}

	/**
	 * Create a {@link VkPhysicalDeviceSparseProperties.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #residencyStandard2DBlockShape}. */
	public static int nresidencyStandard2DBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DBLOCKSHAPE); }
	/** Unsafe version of {@link #residencyStandard2DMultisampleBlockShape}. */
	public static int nresidencyStandard2DMultisampleBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE); }
	/** Unsafe version of {@link #residencyStandard3DBlockShape}. */
	public static int nresidencyStandard3DBlockShape(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYSTANDARD3DBLOCKSHAPE); }
	/** Unsafe version of {@link #residencyAlignedMipSize}. */
	public static int nresidencyAlignedMipSize(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYALIGNEDMIPSIZE); }
	/** Unsafe version of {@link #residencyNonResidentStrict}. */
	public static int nresidencyNonResidentStrict(long struct) { return memGetInt(struct + VkPhysicalDeviceSparseProperties.RESIDENCYNONRESIDENTSTRICT); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceSparseProperties} structs. */
	public static final class Buffer extends StructBuffer<VkPhysicalDeviceSparseProperties, Buffer> {

		/**
		 * Creates a new {@link VkPhysicalDeviceSparseProperties.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceSparseProperties#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceSparseProperties newInstance(long address) {
			return new VkPhysicalDeviceSparseProperties(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code residencyStandard2DBlockShape} field. */
		public boolean residencyStandard2DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DBlockShape(address()) != 0; }
		/** Returns the value of the {@code residencyStandard2DMultisampleBlockShape} field. */
		public boolean residencyStandard2DMultisampleBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard2DMultisampleBlockShape(address()) != 0; }
		/** Returns the value of the {@code residencyStandard3DBlockShape} field. */
		public boolean residencyStandard3DBlockShape() { return VkPhysicalDeviceSparseProperties.nresidencyStandard3DBlockShape(address()) != 0; }
		/** Returns the value of the {@code residencyAlignedMipSize} field. */
		public boolean residencyAlignedMipSize() { return VkPhysicalDeviceSparseProperties.nresidencyAlignedMipSize(address()) != 0; }
		/** Returns the value of the {@code residencyNonResidentStrict} field. */
		public boolean residencyNonResidentStrict() { return VkPhysicalDeviceSparseProperties.nresidencyNonResidentStrict(address()) != 0; }

	}

}