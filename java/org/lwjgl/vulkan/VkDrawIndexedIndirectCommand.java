/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDrawIndexedIndirectCommand.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDrawIndexedIndirectCommand">Vulkan Specification</a>
 * 
 * <p>Describes an indirect indexed draw command.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding</li>
 * <li>({@code indexSize} * ({@code firstIndex} + {@code indexCount}) + {@code offset}) <b>must</b> be less than or equal to the size of the currently bound
 * index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and
 * {@code offset} are specified via {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}</li>
 * <li>If the drawIndirectFirstInstance feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code indexCount} &ndash; the number of vertices to draw</li>
 * <li>{@code instanceCount} &ndash; the number of instances to draw</li>
 * <li>{@code firstIndex} &ndash; the base index within the index buffer</li>
 * <li>{@code vertexOffset} &ndash; the value added to the vertex index before indexing into the vertex buffer</li>
 * <li>{@code firstInstance} &ndash; the instance ID of the first instance to draw</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDrawIndexedIndirectCommand {
    uint32_t indexCount;
    uint32_t instanceCount;
    uint32_t firstIndex;
    int32_t vertexOffset;
    uint32_t firstInstance;
}</code></pre>
 */
public class VkDrawIndexedIndirectCommand extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		INDEXCOUNT,
		INSTANCECOUNT,
		FIRSTINDEX,
		VERTEXOFFSET,
		FIRSTINSTANCE;

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

		INDEXCOUNT = layout.offsetof(0);
		INSTANCECOUNT = layout.offsetof(1);
		FIRSTINDEX = layout.offsetof(2);
		VERTEXOFFSET = layout.offsetof(3);
		FIRSTINSTANCE = layout.offsetof(4);
	}

	VkDrawIndexedIndirectCommand(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDrawIndexedIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDrawIndexedIndirectCommand(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code indexCount} field. */
	public int indexCount() { return nindexCount(address()); }
	/** Returns the value of the {@code instanceCount} field. */
	public int instanceCount() { return ninstanceCount(address()); }
	/** Returns the value of the {@code firstIndex} field. */
	public int firstIndex() { return nfirstIndex(address()); }
	/** Returns the value of the {@code vertexOffset} field. */
	public int vertexOffset() { return nvertexOffset(address()); }
	/** Returns the value of the {@code firstInstance} field. */
	public int firstInstance() { return nfirstInstance(address()); }

	// -----------------------------------

	/** Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDrawIndexedIndirectCommand malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDrawIndexedIndirectCommand calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated with {@link BufferUtils}. */
	public static VkDrawIndexedIndirectCommand create() {
		return new VkDrawIndexedIndirectCommand(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDrawIndexedIndirectCommand} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDrawIndexedIndirectCommand create(long address) {
		return address == NULL ? null : new VkDrawIndexedIndirectCommand(address, null);
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDrawIndexedIndirectCommand.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDrawIndexedIndirectCommand mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDrawIndexedIndirectCommand callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDrawIndexedIndirectCommand mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDrawIndexedIndirectCommand callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #indexCount}. */
	public static int nindexCount(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.INDEXCOUNT); }
	/** Unsafe version of {@link #instanceCount}. */
	public static int ninstanceCount(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.INSTANCECOUNT); }
	/** Unsafe version of {@link #firstIndex}. */
	public static int nfirstIndex(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.FIRSTINDEX); }
	/** Unsafe version of {@link #vertexOffset}. */
	public static int nvertexOffset(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.VERTEXOFFSET); }
	/** Unsafe version of {@link #firstInstance}. */
	public static int nfirstInstance(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.FIRSTINSTANCE); }

	// -----------------------------------

	/** An array of {@link VkDrawIndexedIndirectCommand} structs. */
	public static final class Buffer extends StructBuffer<VkDrawIndexedIndirectCommand, Buffer> {

		/**
		 * Creates a new {@link VkDrawIndexedIndirectCommand.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDrawIndexedIndirectCommand#SIZEOF}, and its mark will be undefined.
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
		protected VkDrawIndexedIndirectCommand newInstance(long address) {
			return new VkDrawIndexedIndirectCommand(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code indexCount} field. */
		public int indexCount() { return VkDrawIndexedIndirectCommand.nindexCount(address()); }
		/** Returns the value of the {@code instanceCount} field. */
		public int instanceCount() { return VkDrawIndexedIndirectCommand.ninstanceCount(address()); }
		/** Returns the value of the {@code firstIndex} field. */
		public int firstIndex() { return VkDrawIndexedIndirectCommand.nfirstIndex(address()); }
		/** Returns the value of the {@code vertexOffset} field. */
		public int vertexOffset() { return VkDrawIndexedIndirectCommand.nvertexOffset(address()); }
		/** Returns the value of the {@code firstInstance} field. */
		public int firstInstance() { return VkDrawIndexedIndirectCommand.nfirstInstance(address()); }

	}

}