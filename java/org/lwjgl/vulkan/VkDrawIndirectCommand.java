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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDrawIndirectCommand.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDrawIndirectCommand">Vulkan Specification</a>
 * 
 * <p>Describes an indirect draw command.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding</li>
 * <li>If the drawIndirectFirstInstance feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vertexCount} &ndash; the number of vertices to draw</li>
 * <li>{@code instanceCount} &ndash; the number of instances to draw</li>
 * <li>{@code firstVertex} &ndash; the index of the first vertex to draw</li>
 * <li>{@code firstInstance} &ndash; the instance ID of the first instance to draw</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDrawIndirectCommand {
    uint32_t vertexCount;
    uint32_t instanceCount;
    uint32_t firstVertex;
    uint32_t firstInstance;
}</code></pre>
 */
public class VkDrawIndirectCommand extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		VERTEXCOUNT,
		INSTANCECOUNT,
		FIRSTVERTEX,
		FIRSTINSTANCE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		VERTEXCOUNT = layout.offsetof(0);
		INSTANCECOUNT = layout.offsetof(1);
		FIRSTVERTEX = layout.offsetof(2);
		FIRSTINSTANCE = layout.offsetof(3);
	}

	VkDrawIndirectCommand(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDrawIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDrawIndirectCommand(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code vertexCount} field. */
	public int vertexCount() { return nvertexCount(address()); }
	/** Returns the value of the {@code instanceCount} field. */
	public int instanceCount() { return ninstanceCount(address()); }
	/** Returns the value of the {@code firstVertex} field. */
	public int firstVertex() { return nfirstVertex(address()); }
	/** Returns the value of the {@code firstInstance} field. */
	public int firstInstance() { return nfirstInstance(address()); }

	// -----------------------------------

	/** Returns a new {@link VkDrawIndirectCommand} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDrawIndirectCommand create(long address) {
		return address == NULL ? null : new VkDrawIndirectCommand(address, null);
	}

	/**
	 * Create a {@link VkDrawIndirectCommand.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #vertexCount}. */
	public static int nvertexCount(long struct) { return memGetInt(struct + VkDrawIndirectCommand.VERTEXCOUNT); }
	/** Unsafe version of {@link #instanceCount}. */
	public static int ninstanceCount(long struct) { return memGetInt(struct + VkDrawIndirectCommand.INSTANCECOUNT); }
	/** Unsafe version of {@link #firstVertex}. */
	public static int nfirstVertex(long struct) { return memGetInt(struct + VkDrawIndirectCommand.FIRSTVERTEX); }
	/** Unsafe version of {@link #firstInstance}. */
	public static int nfirstInstance(long struct) { return memGetInt(struct + VkDrawIndirectCommand.FIRSTINSTANCE); }

	// -----------------------------------

	/** An array of {@link VkDrawIndirectCommand} structs. */
	public static class Buffer extends StructBuffer<VkDrawIndirectCommand, Buffer> {

		/**
		 * Creates a new {@link VkDrawIndirectCommand.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDrawIndirectCommand#SIZEOF}, and its mark will be undefined.
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
		protected VkDrawIndirectCommand newInstance(long address) {
			return new VkDrawIndirectCommand(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code vertexCount} field. */
		public int vertexCount() { return VkDrawIndirectCommand.nvertexCount(address()); }
		/** Returns the value of the {@code instanceCount} field. */
		public int instanceCount() { return VkDrawIndirectCommand.ninstanceCount(address()); }
		/** Returns the value of the {@code firstVertex} field. */
		public int firstVertex() { return VkDrawIndirectCommand.nfirstVertex(address()); }
		/** Returns the value of the {@code firstInstance} field. */
		public int firstInstance() { return VkDrawIndirectCommand.nfirstInstance(address()); }

	}

}