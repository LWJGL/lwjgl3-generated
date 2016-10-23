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
 * Structure specifying a color component mapping.
 * 
 * <h5>Description</h5>
 * 
 * <p>Each of {@code r}, {@code g}, {@code b}, and {@code a} is one of the values:</p>
 * 
 * <pre><code>typedef enum VkComponentSwizzle {
    VK_COMPONENT_SWIZZLE_IDENTITY = 0,
    VK_COMPONENT_SWIZZLE_ZERO = 1,
    VK_COMPONENT_SWIZZLE_ONE = 2,
    VK_COMPONENT_SWIZZLE_R = 3,
    VK_COMPONENT_SWIZZLE_G = 4,
    VK_COMPONENT_SWIZZLE_B = 5,
    VK_COMPONENT_SWIZZLE_A = 6,
} VkComponentSwizzle;</code></pre>
 * 
 * <ul>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}: the component is set to the identity swizzle.</li>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO}: the component is set to zero.</li>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}: the component is set to either 1 or 1.0 depending on whether the type of the image view format is integer or floating-point respectively, as determined by the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-formats-definition">Format Definition</a> section for each {@code VkFormat}.</li>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}: the component is set to the value of the R component of the image.</li>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_G COMPONENT_SWIZZLE_G}: the component is set to the value of the G component of the image.</li>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}: the component is set to the value of the B component of the image.</li>
 * <li>{@link VK10#VK_COMPONENT_SWIZZLE_A COMPONENT_SWIZZLE_A}: the component is set to the value of the A component of the image.</li>
 * </ul>
 * 
 * <p>Setting the identity swizzle on a component is equivalent to setting the identity mapping on that component. That is:</p>
 * 
 * <h6>Component Mappings Equivalent To ename:VK_COMPONENT_SWIZZLE_IDENTITY</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Component</th><th>Identity Mapping</th></tr></thead>
 * <tbody>
 * <tr><td>{@code components.r}</td><td>{@link VK10#VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}</td></tr>
 * <tr><td>{@code components.g}</td><td>{@link VK10#VK_COMPONENT_SWIZZLE_G COMPONENT_SWIZZLE_G}</td></tr>
 * <tr><td>{@code components.b}</td><td>{@link VK10#VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}</td></tr>
 * <tr><td>{@code components.a}</td><td>{@link VK10#VK_COMPONENT_SWIZZLE_A COMPONENT_SWIZZLE_A}</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code r} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * <li>{@code g} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * <li>{@code b} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * <li>{@code a} <b>must</b> be a valid {@code VkComponentSwizzle} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageViewCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code r} &ndash; determines the component value placed in the R component of the output vector.</li>
 * <li>{@code g} &ndash; determines the component value placed in the G component of the output vector.</li>
 * <li>{@code b} &ndash; determines the component value placed in the B component of the output vector.</li>
 * <li>{@code a} &ndash; determines the component value placed in the A component of the output vector.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkComponentMapping {
    VkComponentSwizzle r;
    VkComponentSwizzle g;
    VkComponentSwizzle b;
    VkComponentSwizzle a;
}</code></pre>
 */
public class VkComponentMapping extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		R,
		G,
		B,
		A;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		R = layout.offsetof(0);
		G = layout.offsetof(1);
		B = layout.offsetof(2);
		A = layout.offsetof(3);
	}

	VkComponentMapping(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkComponentMapping} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkComponentMapping(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code r} field. */
	public int r() { return nr(address()); }
	/** Returns the value of the {@code g} field. */
	public int g() { return ng(address()); }
	/** Returns the value of the {@code b} field. */
	public int b() { return nb(address()); }
	/** Returns the value of the {@code a} field. */
	public int a() { return na(address()); }

	/** Sets the specified value to the {@code r} field. */
	public VkComponentMapping r(int value) { nr(address(), value); return this; }
	/** Sets the specified value to the {@code g} field. */
	public VkComponentMapping g(int value) { ng(address(), value); return this; }
	/** Sets the specified value to the {@code b} field. */
	public VkComponentMapping b(int value) { nb(address(), value); return this; }
	/** Sets the specified value to the {@code a} field. */
	public VkComponentMapping a(int value) { na(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkComponentMapping set(
		int r,
		int g,
		int b,
		int a
	) {
		r(r);
		g(g);
		b(b);
		a(a);

		return this;
	}

	/** Unsafe version of {@link #set(VkComponentMapping) set}. */
	public VkComponentMapping nset(long struct) {
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
	public VkComponentMapping set(VkComponentMapping src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkComponentMapping} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkComponentMapping malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkComponentMapping} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkComponentMapping calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkComponentMapping} instance allocated with {@link BufferUtils}. */
	public static VkComponentMapping create() {
		return new VkComponentMapping(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkComponentMapping} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkComponentMapping create(long address) {
		return address == NULL ? null : new VkComponentMapping(address, null);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkComponentMapping.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkComponentMapping} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkComponentMapping mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkComponentMapping} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkComponentMapping callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkComponentMapping} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkComponentMapping mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkComponentMapping} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkComponentMapping callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkComponentMapping.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #r}. */
	public static int nr(long struct) { return memGetInt(struct + VkComponentMapping.R); }
	/** Unsafe version of {@link #g}. */
	public static int ng(long struct) { return memGetInt(struct + VkComponentMapping.G); }
	/** Unsafe version of {@link #b}. */
	public static int nb(long struct) { return memGetInt(struct + VkComponentMapping.B); }
	/** Unsafe version of {@link #a}. */
	public static int na(long struct) { return memGetInt(struct + VkComponentMapping.A); }

	/** Unsafe version of {@link #r(int) r}. */
	public static void nr(long struct, int value) { memPutInt(struct + VkComponentMapping.R, value); }
	/** Unsafe version of {@link #g(int) g}. */
	public static void ng(long struct, int value) { memPutInt(struct + VkComponentMapping.G, value); }
	/** Unsafe version of {@link #b(int) b}. */
	public static void nb(long struct, int value) { memPutInt(struct + VkComponentMapping.B, value); }
	/** Unsafe version of {@link #a(int) a}. */
	public static void na(long struct, int value) { memPutInt(struct + VkComponentMapping.A, value); }

	// -----------------------------------

	/** An array of {@link VkComponentMapping} structs. */
	public static class Buffer extends StructBuffer<VkComponentMapping, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkComponentMapping.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkComponentMapping#SIZEOF}, and its mark will be undefined.
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
		protected VkComponentMapping newInstance(long address) {
			return new VkComponentMapping(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code r} field. */
		public int r() { return VkComponentMapping.nr(address()); }
		/** Returns the value of the {@code g} field. */
		public int g() { return VkComponentMapping.ng(address()); }
		/** Returns the value of the {@code b} field. */
		public int b() { return VkComponentMapping.nb(address()); }
		/** Returns the value of the {@code a} field. */
		public int a() { return VkComponentMapping.na(address()); }

		/** Sets the specified value to the {@code r} field. */
		public VkComponentMapping.Buffer r(int value) { VkComponentMapping.nr(address(), value); return this; }
		/** Sets the specified value to the {@code g} field. */
		public VkComponentMapping.Buffer g(int value) { VkComponentMapping.ng(address(), value); return this; }
		/** Sets the specified value to the {@code b} field. */
		public VkComponentMapping.Buffer b(int value) { VkComponentMapping.nb(address(), value); return this; }
		/** Sets the specified value to the {@code a} field. */
		public VkComponentMapping.Buffer a(int value) { VkComponentMapping.na(address(), value); return this; }

	}

}