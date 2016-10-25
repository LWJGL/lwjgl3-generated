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
 * Structure specifying a descriptor set layout binding.
 * 
 * <h5>Description</h5>
 * 
 * <p>The above layout definition allows the descriptor bindings to be specified sparsely such that not all binding numbers between 0 and the maximum binding number need to be specified in the {@code pBindings} array. However, all binding numbers between 0 and the maximum binding number in the {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings} array <b>may</b> consume memory in the descriptor set layout even if not all descriptor bindings are used, though it <b>should</b> not consume additional memory from the descriptor pool.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The maximum binding number specified <b>should</b> be as compact as possible to avoid wasted memory.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@code descriptorCount} is not 0 and {@code pImmutableSamplers} is not {@code NULL}, {@code pImmutableSamplers} <b>must</b> be a pointer to an array of {@code descriptorCount} valid {@code VkSampler} handles</li>
 * <li>If {@code descriptorCount} is not 0, {@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorSetLayoutCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code binding} &ndash; the binding number of this entry and corresponds to a resource of the same binding number in the shader stages.</li>
 * <li>{@code descriptorType} &ndash; a {@code VkDescriptorType} specifying which type of resource descriptors are used for this binding.</li>
 * <li>{@code descriptorCount} &ndash; the number of descriptors contained in the binding, accessed in a shader as an array. If {@code descriptorCount} is zero this binding entry is reserved and the resource <b>must</b> not be accessed from any stage via this binding within any pipeline using the set layout.</li>
 * <li>{@code stageFlags} &ndash; member is a bitmask of {@code VkShaderStageFlagBits} specifying which pipeline shader stages <b>can</b> access a resource for this binding. {@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL} is a shorthand specifying that all defined shader stages, including any additional stages defined by extensions, <b>can</b> access the resource.
If a shader stage is not included in {@code stageFlags}, then a resource <b>must</b> not be accessed from that stage via this binding within any pipeline using the set layout. There are no limitations on what combinations of stages <b>can</b> be used by a descriptor binding, and in particular a binding <b>can</b> be used by both graphics stages and the compute stage.</li>
 * <li>{@code pImmutableSamplers} &ndash; affects initialization of samplers. If {@code descriptorType} specifies a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} type descriptor, then {@code pImmutableSamplers} <b>can</b> be used to initialize a set of <em>immutable samplers</em>. Immutable samplers are permanently bound into the set layout; later binding a sampler into an immutable sampler slot in a descriptor set is not allowed. If {@code pImmutableSamplers} is not {@code NULL}, then it is considered to be a pointer to an array of sampler handles that will be consumed by the set layout and used for the corresponding binding. If {@code pImmutableSamplers} is {@code NULL}, then the sampler slots are dynamic and sampler handles <b>must</b> be bound into descriptor sets using this layout. If {@code descriptorType} is not one of these descriptor types, then {@code pImmutableSamplers} is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDescriptorSetLayoutBinding {
    uint32_t binding;
    VkDescriptorType descriptorType;
    uint32_t descriptorCount;
    VkShaderStageFlags stageFlags;
    const VkSampler * pImmutableSamplers;
}</code></pre>
 */
public class VkDescriptorSetLayoutBinding extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BINDING,
		DESCRIPTORTYPE,
		DESCRIPTORCOUNT,
		STAGEFLAGS,
		PIMMUTABLESAMPLERS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BINDING = layout.offsetof(0);
		DESCRIPTORTYPE = layout.offsetof(1);
		DESCRIPTORCOUNT = layout.offsetof(2);
		STAGEFLAGS = layout.offsetof(3);
		PIMMUTABLESAMPLERS = layout.offsetof(4);
	}

	VkDescriptorSetLayoutBinding(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorSetLayoutBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorSetLayoutBinding(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code binding} field. */
	public int binding() { return nbinding(address()); }
	/** Returns the value of the {@code descriptorType} field. */
	public int descriptorType() { return ndescriptorType(address()); }
	/** Returns the value of the {@code descriptorCount} field. */
	public int descriptorCount() { return ndescriptorCount(address()); }
	/** Returns the value of the {@code stageFlags} field. */
	public int stageFlags() { return nstageFlags(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pImmutableSamplers} field. */
	public LongBuffer pImmutableSamplers() { return npImmutableSamplers(address()); }

	/** Sets the specified value to the {@code binding} field. */
	public VkDescriptorSetLayoutBinding binding(int value) { nbinding(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorType} field. */
	public VkDescriptorSetLayoutBinding descriptorType(int value) { ndescriptorType(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorCount} field. */
	public VkDescriptorSetLayoutBinding descriptorCount(int value) { ndescriptorCount(address(), value); return this; }
	/** Sets the specified value to the {@code stageFlags} field. */
	public VkDescriptorSetLayoutBinding stageFlags(int value) { nstageFlags(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pImmutableSamplers} field. */
	public VkDescriptorSetLayoutBinding pImmutableSamplers(LongBuffer value) { npImmutableSamplers(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorSetLayoutBinding set(
		int binding,
		int descriptorType,
		int descriptorCount,
		int stageFlags,
		LongBuffer pImmutableSamplers
	) {
		binding(binding);
		descriptorType(descriptorType);
		descriptorCount(descriptorCount);
		stageFlags(stageFlags);
		pImmutableSamplers(pImmutableSamplers);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorSetLayoutBinding) set}. */
	public VkDescriptorSetLayoutBinding nset(long struct) {
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
	public VkDescriptorSetLayoutBinding set(VkDescriptorSetLayoutBinding src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutBinding malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutBinding calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorSetLayoutBinding create() {
		return new VkDescriptorSetLayoutBinding(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorSetLayoutBinding create(long address) {
		return address == NULL ? null : new VkDescriptorSetLayoutBinding(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorSetLayoutBinding.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDescriptorSetLayoutBinding mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDescriptorSetLayoutBinding callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorSetLayoutBinding mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorSetLayoutBinding callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #binding}. */
	public static int nbinding(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.BINDING); }
	/** Unsafe version of {@link #descriptorType}. */
	public static int ndescriptorType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE); }
	/** Unsafe version of {@link #descriptorCount}. */
	public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT); }
	/** Unsafe version of {@link #stageFlags}. */
	public static int nstageFlags(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBinding.STAGEFLAGS); }
	/** Unsafe version of {@link #pImmutableSamplers() pImmutableSamplers}. */
	public static LongBuffer npImmutableSamplers(long struct) { return memLongBuffer(memGetAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS), ndescriptorCount(struct)); }

	/** Unsafe version of {@link #binding(int) binding}. */
	public static void nbinding(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.BINDING, value); }
	/** Unsafe version of {@link #descriptorType(int) descriptorType}. */
	public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE, value); }
	/** Sets the specified value to the {@code descriptorCount} field of the specified {@code struct}. */
	public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT, value); }
	/** Unsafe version of {@link #stageFlags(int) stageFlags}. */
	public static void nstageFlags(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBinding.STAGEFLAGS, value); }
	/** Unsafe version of {@link #pImmutableSamplers(LongBuffer) pImmutableSamplers}. */
	public static void npImmutableSamplers(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS, memAddressSafe(value)); ndescriptorCount(struct, value == null ? 0 : value.remaining()); }

	// -----------------------------------

	/** An array of {@link VkDescriptorSetLayoutBinding} structs. */
	public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBinding, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkDescriptorSetLayoutBinding.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorSetLayoutBinding#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorSetLayoutBinding newInstance(long address) {
			return new VkDescriptorSetLayoutBinding(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code binding} field. */
		public int binding() { return VkDescriptorSetLayoutBinding.nbinding(address()); }
		/** Returns the value of the {@code descriptorType} field. */
		public int descriptorType() { return VkDescriptorSetLayoutBinding.ndescriptorType(address()); }
		/** Returns the value of the {@code descriptorCount} field. */
		public int descriptorCount() { return VkDescriptorSetLayoutBinding.ndescriptorCount(address()); }
		/** Returns the value of the {@code stageFlags} field. */
		public int stageFlags() { return VkDescriptorSetLayoutBinding.nstageFlags(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pImmutableSamplers} field. */
		public LongBuffer pImmutableSamplers() { return VkDescriptorSetLayoutBinding.npImmutableSamplers(address()); }

		/** Sets the specified value to the {@code binding} field. */
		public VkDescriptorSetLayoutBinding.Buffer binding(int value) { VkDescriptorSetLayoutBinding.nbinding(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorType} field. */
		public VkDescriptorSetLayoutBinding.Buffer descriptorType(int value) { VkDescriptorSetLayoutBinding.ndescriptorType(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorCount} field. */
		public VkDescriptorSetLayoutBinding.Buffer descriptorCount(int value) { VkDescriptorSetLayoutBinding.ndescriptorCount(address(), value); return this; }
		/** Sets the specified value to the {@code stageFlags} field. */
		public VkDescriptorSetLayoutBinding.Buffer stageFlags(int value) { VkDescriptorSetLayoutBinding.nstageFlags(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pImmutableSamplers} field. */
		public VkDescriptorSetLayoutBinding.Buffer pImmutableSamplers(LongBuffer value) { VkDescriptorSetLayoutBinding.npImmutableSamplers(address(), value); return this; }

	}

}