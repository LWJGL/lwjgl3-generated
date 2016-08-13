/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a href="https://github.com/Cyan4973/xxHash">xxhash</a>.
 * 
 * <p>xxHash is an extremely fast Hash algorithm, running at RAM speed limits. It also successfully passes all tests from the SMHasher suite.</p>
 */
public class XXHash {

	/** Error codes. */
	public static final int
		XXH_OK    = 0,
		XXH_ERROR = 1;

	/** The major version number. */
	public static final int XXH_VERSION_MAJOR = 0;

	/** The minor version number. */
	public static final int XXH_VERSION_MINOR = 6;

	/** The release version number. */
	public static final int XXH_VERSION_RELEASE = 2;

	/** The version number */
	public static final int XXH_VERSION_NUMBER = (XXH_VERSION_MAJOR *100*100 + XXH_VERSION_MINOR *100 + XXH_VERSION_RELEASE);

	static { LibXXHash.initialize(); }

	static { MemoryUtil.getAllocator(); }

	protected XXHash() {
		throw new UnsupportedOperationException();
	}

	// --- [ XXH32 ] ---

	/**
	 * Calculates the 32-bits hash of sequence {@code length} bytes stored at memory address {@code input}.
	 *
	 * @param input  the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length the number of bytes stored at memory address {@code input}
	 * @param seed   the seed that can be used to alter the result predictably
	 */
	public static native int nXXH32(long input, long length, int seed);

	/**
	 * Calculates the 32-bits hash of sequence {@code length} bytes stored at memory address {@code input}.
	 *
	 * @param input the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param seed  the seed that can be used to alter the result predictably
	 */
	public static int XXH32(ByteBuffer input, int seed) {
		return nXXH32(memAddress(input), (long)input.remaining(), seed);
	}

	// --- [ XXH32_createState ] ---

	/**
	 * Creates memory for {@code XXH32_state_t}. The state must then be initialized using {@link #XXH32_reset 32_reset} before first use.
	 * 
	 * <p><b>LWJGL note</b>: This function simply delegates to the system {@code malloc()} function.</p>
	 */
	public static native long nXXH32_createState();

	/**
	 * Creates memory for {@code XXH32_state_t}. The state must then be initialized using {@link #XXH32_reset 32_reset} before first use.
	 * 
	 * <p><b>LWJGL note</b>: This function simply delegates to the system {@code malloc()} function.</p>
	 */
	public static XXH32State XXH32_createState() {
		long __result = nXXH32_createState();
		return XXH32State.create(__result);
	}

	// --- [ XXH32_freeState ] ---

	/**
	 * Frees the specified {@code XXH32_state_t}.
	 *
	 * @param statePtr the state to free
	 */
	public static native int nXXH32_freeState(long statePtr);

	/**
	 * Frees the specified {@code XXH32_state_t}.
	 *
	 * @param statePtr the state to free
	 */
	public static int XXH32_freeState(XXH32State statePtr) {
		return nXXH32_freeState(statePtr.address());
	}

	// --- [ XXH32_copyState ] ---

	public static native void nXXH32_copyState(long dst_state, long src_state);

	public static void XXH32_copyState(XXH32State dst_state, XXH32State src_state) {
		nXXH32_copyState(dst_state.address(), src_state.address());
	}

	// --- [ XXH32_reset ] ---

	/**
	 * Resets the specified {@code XXH32_state_t}.
	 *
	 * @param statePtr the {@code XXH32_state_t} to reset
	 * @param seed     the seed that can be used to alter the hashing result predictably
	 */
	public static native int nXXH32_reset(long statePtr, int seed);

	/**
	 * Resets the specified {@code XXH32_state_t}.
	 *
	 * @param statePtr the {@code XXH32_state_t} to reset
	 * @param seed     the seed that can be used to alter the hashing result predictably
	 */
	public static int XXH32_reset(XXH32State statePtr, int seed) {
		return nXXH32_reset(statePtr.address(), seed);
	}

	// --- [ XXH32_update ] ---

	/**
	 * These functions generate the xxHash of an input provided in multiple segments. Note that, for small input, they are slower than single-call functions,
	 * due to state management. For small input, prefer {@link #XXH32 32}.
	 * 
	 * <p>XXH state must first be allocated, using {@link #XXH32_createState 32_createState}.</p>
	 * 
	 * <p>Start a new hash by initializing state with a seed, using {@link #XXH32_reset 32_reset}.</p>
	 * 
	 * <p>Then, feed the hash state by calling {@link #XXH32_update 32_update} as many times as necessary. Obviously, input must be allocated and read accessible. The function
	 * returns an error code, with 0 meaning OK, and any other value meaning there is an error.</p>
	 * 
	 * <p>Finally, a hash value can be produced anytime, by using {@link #XXH32_digest 32_digest}. This function returns the 32-bits hash as an int.</p>
	 * 
	 * <p>It's still possible to continue inserting input into the hash state after a digest, and generate some new hashes later on, by calling again
	 * {@link #XXH32_digest 32_digest}.</p>
	 * 
	 * <p>When done, free XXH state space.</p>
	 *
	 * @param statePtr the {@code XXH32_state_t} to use
	 * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length   the number of bytes stored at memory address {@code input}
	 */
	public static native int nXXH32_update(long statePtr, long input, long length);

	/**
	 * These functions generate the xxHash of an input provided in multiple segments. Note that, for small input, they are slower than single-call functions,
	 * due to state management. For small input, prefer {@link #XXH32 32}.
	 * 
	 * <p>XXH state must first be allocated, using {@link #XXH32_createState 32_createState}.</p>
	 * 
	 * <p>Start a new hash by initializing state with a seed, using {@link #XXH32_reset 32_reset}.</p>
	 * 
	 * <p>Then, feed the hash state by calling {@link #XXH32_update 32_update} as many times as necessary. Obviously, input must be allocated and read accessible. The function
	 * returns an error code, with 0 meaning OK, and any other value meaning there is an error.</p>
	 * 
	 * <p>Finally, a hash value can be produced anytime, by using {@link #XXH32_digest 32_digest}. This function returns the 32-bits hash as an int.</p>
	 * 
	 * <p>It's still possible to continue inserting input into the hash state after a digest, and generate some new hashes later on, by calling again
	 * {@link #XXH32_digest 32_digest}.</p>
	 * 
	 * <p>When done, free XXH state space.</p>
	 *
	 * @param statePtr the {@code XXH32_state_t} to use
	 * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 */
	public static int XXH32_update(XXH32State statePtr, ByteBuffer input) {
		return nXXH32_update(statePtr.address(), memAddress(input), (long)input.remaining());
	}

	// --- [ XXH32_digest ] ---

	/**
	 * Returns the final 32-bits hash of the specified {@code XXH32_state_t}.
	 *
	 * @param statePtr the {@code XXH32_state_t} to use
	 */
	public static native int nXXH32_digest(long statePtr);

	/**
	 * Returns the final 32-bits hash of the specified {@code XXH32_state_t}.
	 *
	 * @param statePtr the {@code XXH32_state_t} to use
	 */
	public static int XXH32_digest(XXH32State statePtr) {
		return nXXH32_digest(statePtr.address());
	}

	// --- [ XXH32_canonicalFromHash ] ---

	/**
	 * Default result type for XXH functions are primitive unsigned 32 and 64 bits.
	 * 
	 * <p>The canonical representation uses human-readable write convention, aka big-endian (large digits first). These functions allow transformation of hash
	 * result into and from its canonical format. This way, hash values can be written into a file / memory, and remain comparable on different systems and
	 * programs.</p>
	 *
	 * @param dst  the destination canonical representation
	 * @param hash the source hash
	 */
	public static native void nXXH32_canonicalFromHash(long dst, int hash);

	/**
	 * Default result type for XXH functions are primitive unsigned 32 and 64 bits.
	 * 
	 * <p>The canonical representation uses human-readable write convention, aka big-endian (large digits first). These functions allow transformation of hash
	 * result into and from its canonical format. This way, hash values can be written into a file / memory, and remain comparable on different systems and
	 * programs.</p>
	 *
	 * @param dst  the destination canonical representation
	 * @param hash the source hash
	 */
	public static void XXH32_canonicalFromHash(XXH32Canonical dst, int hash) {
		nXXH32_canonicalFromHash(dst.address(), hash);
	}

	// --- [ XXH32_hashFromCanonical ] ---

	/**
	 * Transforms the specified canonical representation to a primitive value.
	 *
	 * @param src the source canonical representation
	 */
	public static native int nXXH32_hashFromCanonical(long src);

	/**
	 * Transforms the specified canonical representation to a primitive value.
	 *
	 * @param src the source canonical representation
	 */
	public static int XXH32_hashFromCanonical(XXH32Canonical src) {
		return nXXH32_hashFromCanonical(src.address());
	}

	// --- [ XXH64 ] ---

	/**
	 * 64-bit version of {@link #XXH32 32}.
	 * 
	 * <p>This function runs 2x faster on 64-bits systems, but slower on 32-bits systems.</p>
	 *
	 * @param input  the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length the number of bytes stored at memory address {@code input}
	 * @param seed   the seed that can be used to alter the result predictably
	 */
	public static native long nXXH64(long input, long length, long seed);

	/**
	 * 64-bit version of {@link #XXH32 32}.
	 * 
	 * <p>This function runs 2x faster on 64-bits systems, but slower on 32-bits systems.</p>
	 *
	 * @param input the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param seed  the seed that can be used to alter the result predictably
	 */
	public static long XXH64(ByteBuffer input, long seed) {
		return nXXH64(memAddress(input), (long)input.remaining(), seed);
	}

	// --- [ XXH64_createState ] ---

	/** 64-bit version of {@link #XXH32_createState 32_createState}. */
	public static native long nXXH64_createState();

	/** 64-bit version of {@link #XXH32_createState 32_createState}. */
	public static XXH64State XXH64_createState() {
		long __result = nXXH64_createState();
		return XXH64State.create(__result);
	}

	// --- [ XXH64_freeState ] ---

	/**
	 * 64-bit version of {@link #XXH32_freeState 32_freeState}.
	 *
	 * @param statePtr the state to free
	 */
	public static native int nXXH64_freeState(long statePtr);

	/**
	 * 64-bit version of {@link #XXH32_freeState 32_freeState}.
	 *
	 * @param statePtr the state to free
	 */
	public static int XXH64_freeState(XXH64State statePtr) {
		return nXXH64_freeState(statePtr.address());
	}

	// --- [ XXH64_copyState ] ---

	public static native void nXXH64_copyState(long dst_state, long src_state);

	public static void XXH64_copyState(XXH64State dst_state, XXH64State src_state) {
		nXXH64_copyState(dst_state.address(), src_state.address());
	}

	// --- [ XXH64_reset ] ---

	/**
	 * 64-bit version of {@link #XXH32_reset 32_reset}.
	 *
	 * @param statePtr the {@code XXH64_state_t} to reset
	 * @param seed     the seed that can be used to alter the hashing result predictably
	 */
	public static native int nXXH64_reset(long statePtr, long seed);

	/**
	 * 64-bit version of {@link #XXH32_reset 32_reset}.
	 *
	 * @param statePtr the {@code XXH64_state_t} to reset
	 * @param seed     the seed that can be used to alter the hashing result predictably
	 */
	public static int XXH64_reset(XXH64State statePtr, long seed) {
		return nXXH64_reset(statePtr.address(), seed);
	}

	// --- [ XXH64_update ] ---

	/**
	 * 64-bit version of {@link #XXH32_update 32_update}.
	 *
	 * @param statePtr the {@code XXH64_state_t} to use
	 * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 * @param length   the number of bytes stored at memory address {@code input}
	 */
	public static native int nXXH64_update(long statePtr, long input, long length);

	/**
	 * 64-bit version of {@link #XXH32_update 32_update}.
	 *
	 * @param statePtr the {@code XXH64_state_t} to use
	 * @param input    the bytes to hash. The memory between {@code input} &amp; {@code input+length} must be valid (allocated and read-accessible).
	 */
	public static int XXH64_update(XXH64State statePtr, ByteBuffer input) {
		return nXXH64_update(statePtr.address(), memAddress(input), (long)input.remaining());
	}

	// --- [ XXH64_digest ] ---

	/**
	 * 64-bit version of {@link #XXH32_digest 32_digest}.
	 *
	 * @param statePtr the {@code XXH64_state_t} to use
	 */
	public static native long nXXH64_digest(long statePtr);

	/**
	 * 64-bit version of {@link #XXH32_digest 32_digest}.
	 *
	 * @param statePtr the {@code XXH64_state_t} to use
	 */
	public static long XXH64_digest(XXH64State statePtr) {
		return nXXH64_digest(statePtr.address());
	}

	// --- [ XXH64_canonicalFromHash ] ---

	/**
	 * 64-bit version of {@link #XXH32_canonicalFromHash 32_canonicalFromHash}.
	 *
	 * @param dst  the destination canonical representation
	 * @param hash the source hash
	 */
	public static native void nXXH64_canonicalFromHash(long dst, long hash);

	/**
	 * 64-bit version of {@link #XXH32_canonicalFromHash 32_canonicalFromHash}.
	 *
	 * @param dst  the destination canonical representation
	 * @param hash the source hash
	 */
	public static void XXH64_canonicalFromHash(XXH64Canonical dst, long hash) {
		nXXH64_canonicalFromHash(dst.address(), hash);
	}

	// --- [ XXH64_hashFromCanonical ] ---

	/**
	 * 64-bit version of {@link #XXH32_hashFromCanonical 32_hashFromCanonical}.
	 *
	 * @param src the source canonical representation
	 */
	public static native long nXXH64_hashFromCanonical(long src);

	/**
	 * 64-bit version of {@link #XXH32_hashFromCanonical 32_hashFromCanonical}.
	 *
	 * @param src the source canonical representation
	 */
	public static long XXH64_hashFromCanonical(XXH64Canonical src) {
		return nXXH64_hashFromCanonical(src.address());
	}

}