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
 * Structure specifying a dispatch indirect command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDispatchIndirectCommand} structure have the same meaning as the similarly named parameters of {@link VK10#vkCmdDispatch CmdDispatch}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code x} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[0]</li>
 * <li>{@code y} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[1]</li>
 * <li>{@code z} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxComputeWorkGroupCount}[2]</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdDispatchIndirect CmdDispatchIndirect}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the number of local workgroups to dispatch in the X dimension.</li>
 * <li>{@code y} &ndash; the number of local workgroups to dispatch in the Y dimension.</li>
 * <li>{@code z} &ndash; the number of local workgroups to dispatch in the Z dimension.</li>
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
public class VkDispatchIndirectCommand extends Struct implements NativeResource {

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

	/** Sets the specified value to the {@code x} field. */
	public VkDispatchIndirectCommand x(int value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public VkDispatchIndirectCommand y(int value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code z} field. */
	public VkDispatchIndirectCommand z(int value) { nz(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDispatchIndirectCommand set(
		int x,
		int y,
		int z
	) {
		x(x);
		y(y);
		z(z);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkDispatchIndirectCommand set(VkDispatchIndirectCommand src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkDispatchIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDispatchIndirectCommand malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDispatchIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDispatchIndirectCommand calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDispatchIndirectCommand} instance allocated with {@link BufferUtils}. */
	public static VkDispatchIndirectCommand create() {
		return new VkDispatchIndirectCommand(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDispatchIndirectCommand} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDispatchIndirectCommand create(long address) {
		return address == NULL ? null : new VkDispatchIndirectCommand(address, null);
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
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

	/** Returns a new {@link VkDispatchIndirectCommand} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDispatchIndirectCommand mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDispatchIndirectCommand} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDispatchIndirectCommand callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDispatchIndirectCommand mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDispatchIndirectCommand callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDispatchIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + VkDispatchIndirectCommand.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + VkDispatchIndirectCommand.Y); }
	/** Unsafe version of {@link #z}. */
	public static int nz(long struct) { return memGetInt(struct + VkDispatchIndirectCommand.Z); }

	/** Unsafe version of {@link #x(int) x}. */
	public static void nx(long struct, int value) { memPutInt(struct + VkDispatchIndirectCommand.X, value); }
	/** Unsafe version of {@link #y(int) y}. */
	public static void ny(long struct, int value) { memPutInt(struct + VkDispatchIndirectCommand.Y, value); }
	/** Unsafe version of {@link #z(int) z}. */
	public static void nz(long struct, int value) { memPutInt(struct + VkDispatchIndirectCommand.Z, value); }

	// -----------------------------------

	/** An array of {@link VkDispatchIndirectCommand} structs. */
	public static class Buffer extends StructBuffer<VkDispatchIndirectCommand, Buffer> implements NativeResource {

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
			return new VkDispatchIndirectCommand(address, container);
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

		/** Sets the specified value to the {@code x} field. */
		public VkDispatchIndirectCommand.Buffer x(int value) { VkDispatchIndirectCommand.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public VkDispatchIndirectCommand.Buffer y(int value) { VkDispatchIndirectCommand.ny(address(), value); return this; }
		/** Sets the specified value to the {@code z} field. */
		public VkDispatchIndirectCommand.Buffer z(int value) { VkDispatchIndirectCommand.nz(address(), value); return this; }

	}

}