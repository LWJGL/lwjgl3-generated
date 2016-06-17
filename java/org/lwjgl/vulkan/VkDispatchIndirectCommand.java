/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDispatchIndirectCommand.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDispatchIndirectCommand">Vulkan Specification</a>
 * 
 * <p>Describes an indirect dispatch command.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code x} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
 * <li>{@code y} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
 * <li>{@code z} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the number of local workgroups to dispatch in the X dimension</li>
 * <li>{@code y} &ndash; the number of local workgroups to dispatch in the Y dimension</li>
 * <li>{@code z} &ndash; the number of local workgroups to dispatch in the Z dimension</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDispatchIndirectCommand {
    uint32_t x;
    uint32_t y;
    uint32_t z;
}</code></pre>
 */
public class VkDispatchIndirectCommand extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		Z = layout.offsetof(2);
	}

	VkDispatchIndirectCommand(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDispatchIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDispatchIndirectCommand(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }
	/** Returns the value of the {@code z} field. */
	public int z() { return nz(address()); }

	// -----------------------------------

	/** Returns a new {@link VkDispatchIndirectCommand} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDispatchIndirectCommand create(long address) {
		return address == NULL ? null : new VkDispatchIndirectCommand(address, null);
	}

	/**
	 * Create a {@link VkDispatchIndirectCommand.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + VkDispatchIndirectCommand.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + VkDispatchIndirectCommand.Y); }
	/** Unsafe version of {@link #z}. */
	public static int nz(long struct) { return memGetInt(struct + VkDispatchIndirectCommand.Z); }

	// -----------------------------------

	/** An array of {@link VkDispatchIndirectCommand} structs. */
	public static final class Buffer extends StructBuffer<VkDispatchIndirectCommand, Buffer> {

		/**
		 * Creates a new {@link VkDispatchIndirectCommand.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDispatchIndirectCommand#SIZEOF}, and its mark will be undefined.
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
		protected VkDispatchIndirectCommand newInstance(long address) {
			return new VkDispatchIndirectCommand(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return VkDispatchIndirectCommand.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return VkDispatchIndirectCommand.ny(address()); }
		/** Returns the value of the {@code z} field. */
		public int z() { return VkDispatchIndirectCommand.nz(address()); }

	}

}